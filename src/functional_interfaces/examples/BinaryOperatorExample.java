package functional_interfaces.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * represents an operation that combines two arguments of type t and returns a result of the same type t.
 * it is used to perform reduction operations on pairs of elements, such as adding numbers or combining objects.
 */
public class BinaryOperatorExample {
    public static void main(String[] args) {
        //create a integer list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        //use the binaryoperator with a lambda expression to add two integer numbers
        BinaryOperator<Integer> sum = Integer::sum;

        //use the binaryoperator to add all the numbers in the stream
        int result = numbers.stream().reduce(0, Integer::sum);

        //print the result of the sum
        System.out.println("The sum of the numbers is: " + result);
    }
}
