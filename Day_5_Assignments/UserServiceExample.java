import java.util.Optional;

// Define the UserService interface
interface UserService {
    // Default method to return a generic welcome message
    default String getWelcomeMessage() {
        return "Welcome, Guest!";
    }

    // Method to get user name wrapped in Optional
    Optional<String> getUser(String name);
}

// Implementation of UserService
class UserServiceImpl implements UserService {
    @Override
    public Optional<String> getUser(String name) {
        return Optional.ofNullable(name);  // Wrap the name in Optional (it can be null)
    }

    // Method to return personalized or default welcome message
    public String getPersonalizedWelcome(String name) {
        return getUser(name)
                .map(userName -> "Welcome, " + userName + "!")  // If name is present
                .orElse(getWelcomeMessage());                   // If name is null
    }
}

// Main class to test the implementation
public class UserServiceExample {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        // Test with a valid name
        System.out.println(userService.getPersonalizedWelcome("Prabin"));

        // Test with a null value
        System.out.println(userService.getPersonalizedWelcome(null));
    }
}
