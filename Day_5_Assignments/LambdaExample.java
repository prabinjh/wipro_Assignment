import java.util.*;

// Functional Interface
@FunctionalInterface
interface StringProcessor {
    String process(String str);
}

public class LambdaExample {
    public static void main(String[] args) {
        // List of strings
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "mango");

        // Sorting in reverse alphabetical order using lambda
        words.sort((s1, s2) -> s2.compareTo(s1));

        // Display sorted list
        System.out.println("Sorted List (Reverse Alphabetical Order): " + words);

        // Using lambda to process strings (convert to uppercase)
        StringProcessor toUpperCaseProcessor = str -> str.toUpperCase();

        // Processing and printing uppercase strings
        System.out.println("Uppercase Strings:");
        words.forEach(word -> System.out.println(toUpperCaseProcessor.process(word)));
    }
}
