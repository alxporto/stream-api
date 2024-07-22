package functional_interfaces.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * represents a function that accepts an argument of type t and returns a result of type r.
 * it is used to transform or map the stream elements into other values or types.
 */
public class FunctionExample {
    public static void main(String[] args) {
        //create a integer list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 25);

        //use the function with a lambda expression to double all the numbers
        Function<Integer, Integer> toDouble = number -> number * 2;

        //use a function to double all the numbers in the stream and store them in another list
        List<Integer> doubledNumbers = numbers.stream()
                .map(toDouble)
                .toList();

        //print a list of doubled numbers
        doubledNumbers.forEach(System.out::println);
    }
}
