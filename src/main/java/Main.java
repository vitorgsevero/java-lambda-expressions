import java.util.ArrayList;
import java.util.function.Consumer;

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
        System.out.println("\nUse a lamba expression in the ArrayList's forEach() method to print every item in the list");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach(System.out::println);

        // Using Java's Consumer interface to store a lambda expression in a variable
        System.out.println("\nUsing Java's Consumer interface to store a lambda expression in a variable");
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        integerArrayList.add(5);
        integerArrayList.add(9);
        integerArrayList.add(8);
        integerArrayList.add(1);
        Consumer<Integer> method = System.out::println;
        integerArrayList.forEach(method);

    }
}
