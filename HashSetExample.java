import java.util.HashSet; // Import HashSet

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet of strings
        HashSet<String> cities = new HashSet<>();
        
        // Add five city names to the set, including a duplicate
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        cities.add("Tokyo");
        cities.add("London"); // Duplicate entry
        
        // Display the elements in the set
        System.out.println("Cities in the HashSet:");
        for (String city : cities) {
            System.out.println(city);
        }
        
        // Check if a particular city exists in the set
        String cityToCheck = "Paris";
        if (cities.contains(cityToCheck)) {
            System.out.println(cityToCheck + " exists in the HashSet.");
        } else {
            System.out.println(cityToCheck + " does not exist in the HashSet.");
        }
        
        // Remove a city from the set
        cities.remove("Tokyo");
        
        // Display the updated set
        System.out.println("Updated Cities in the HashSet:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
