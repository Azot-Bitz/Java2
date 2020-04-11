import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) throws RuntimeException, IOException {
        Socket socket = null;
        try {
            socket = new Socket("localhost", 4444);
            Scanner in =  new Scanner(socket.getInputStream());
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner sc = new Scanner(System.in);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        String msg = in.nextLine();
                        System.out.println("Сервер: " + msg);
                    }
                }
            }).start();
            while (true) {
                System.out.println("Напишите свое сообщение...");
                String msg = sc.nextLine();
                if(msg.equals("/end")){
                    socket.close();
                    break;
                }
                out.println(msg);
            }
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
