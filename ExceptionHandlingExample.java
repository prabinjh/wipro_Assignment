package wipro_Assignment;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Null Pointer Exception Example
            String str = null;
            System.out.println(str.length()); // This will throw NullPointerException

        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        try {
            // Array Index Out of Bound Exception Example
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } 
        
        finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues execution...");
    }
}
