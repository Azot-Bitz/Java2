import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {

    public static void main(String[] args) {
        Scanner is = new Scanner(System.in);
        Socket socket = null;
        try (ServerSocket serverSocket = new ServerSocket(4444)) {
            System.out.println("Сервер запущен, ожидаем подключения...");
            socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            Scanner in = new Scanner(socket.getInputStream());
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner sc = new Scanner(System.in);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        System.out.println("Сервер, напишите свое сообщение");
                        String msg = sc.nextLine();
                        System.out.println("Сообщение было отправлено");
                        out.println(msg);
                    }
                }
            }).start();
            while (true) {
                String msg1 = in.nextLine();
                if (msg1.equals("/end")) {
                    break;
                }
                System.out.println("Клиент: " + msg1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


