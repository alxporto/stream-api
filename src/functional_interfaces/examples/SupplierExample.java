package functional_interfaces.examples;

import java.util.List;
import java.util.stream.Stream;
import java.util.function.Supplier;

/**
 * represents an operation that does not accept any arguments and returns a result of type t.
 * it is commonly used to create or provide new objects of a certain type.
 */
public class SupplierExample {
    public static void main(String[] args) {
        //use the supplier with the lambda expression to provide a custom salutation
        Supplier<String> salutation = () -> "Hello, welcome!";

        //use supplier to get a list with 5 salutations
        List<String> salutationsList = Stream.generate(salutation)
                .limit(3)
                .toList();

        //print the generated salutations
        salutationsList.forEach(System.out::println);
    }
}
