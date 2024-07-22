package functional_interfaces.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * represents an operation that accepts an argument of type t and returns no result.
 * it is mainly used to perform actions, or side effects on stream elements without modifying, or
 * return a value.
 */
public class ConsumerExample {
    public static void main(String[] args) {
      //create a integer list of numbers
      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 8);

      //use the consumer with an lambda expression to print the even numbers
      Consumer<Integer> printEvenNumber = number -> {
        if (number % 2 == 0) {
            System.out.println(number);
        }
      };

      //use the consumer to print the even numbers on stream
      numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
