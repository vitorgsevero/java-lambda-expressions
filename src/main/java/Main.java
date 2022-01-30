import java.util.ArrayList;

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

        // Lambda function to print each list element
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach(System.out::println);

    }
}
