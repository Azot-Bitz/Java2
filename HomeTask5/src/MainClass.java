public class MainClass {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;


    public static void main(String[] args) throws InterruptedException {
        float[] arr = new float[SIZE];
        long oneTime = oneTread(arr);
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }
        long b = System.currentTimeMillis();
        float[] a1 = new float[HALF];
        float[] a2 = new float[HALF];
        int h = HALF;
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        System.currentTimeMillis();
        long end2 = System.currentTimeMillis() - b;
        System.out.println("Time of layout array: " +  end2);

        Runnable task2 = () -> {
            for (int i = 0; i < h; i++) {
                a1[i] = 1;
            }
            for (int j = 0; j < h; j++) {
                a1[j] = (float) (a1[j] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j / 2));
            }
            System.currentTimeMillis();
            long l = System.currentTimeMillis() - b;
            System.out.println("Time of the first thread: " + l);
        };

        Runnable task = () -> {
            for (int i = 0; i < h; i++) {
                a2[i] = 1;
            }
            for (int j = 0; j < h; j++) {
                a2[j] = (float) (a2[j] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j / 2));
            }
            System.currentTimeMillis();
            long g = System.currentTimeMillis() - b;
            System.out.println("Time of the second thread: " + g);
        };

        Thread one = new Thread(task2);
        Thread two = new Thread(task);

        one.start();
        two.start();

        one.join();
        two.join();

        long c = System.currentTimeMillis();
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        System.currentTimeMillis();
        long end = System.currentTimeMillis() - c;
        System.out.println("Time of splice arrays: " + end);
    }
    private static long oneTread (float [] arr){
        long a = System.currentTimeMillis();
        for (int j = 0; j < SIZE; j++) {
            arr[j] = (float) (arr[j] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j / 2));
        }
        System.currentTimeMillis();
        long oneTime = System.currentTimeMillis() - a;
        System.out.println("Time of one thread: " + oneTime);
        return oneTime;
    }
}

