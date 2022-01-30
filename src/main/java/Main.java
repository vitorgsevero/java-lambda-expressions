public class Main {
    public static void main(String[] args) {

        // Without Java 8 Lambda Functions
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        }).start();

        // Java 8 Lambda Functions
        new Thread(() -> System.out.println("Hello World!")).start();


    }
}
