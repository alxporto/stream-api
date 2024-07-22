package functional_interfaces.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * represents a function that accepts an argument of type t and returns a boolean value (true or false).
 * it is commonly used to filter the elements of the stream based on some condition.
 */
public class PredicateExample {
    public static void main(String[] args) {
        //create a list of words
        List<String> words = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        //create a predicate which checks if the word has more than 5 characters
        Predicate<String> moreThanFiveCharacters = word -> word.length() > 5;

        //use the stream to filter the words with more than 5 characters and, then,
        //print each word that passed the filter
        words.stream()
                .filter(moreThanFiveCharacters)
                .forEach(System.out::println);
    }
}
