package wipro_Assignment;

// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
// Main Class
public class CustomExceptionExample {
    // Method to validate age
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above. Given age: " + age);
        } else {
            System.out.println("Access granted! Your age: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);  // Will trigger exception
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("Age verification process completed.");
        }
    }
}
