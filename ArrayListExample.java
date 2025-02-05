import java.util.ArrayList; // Import the ArrayList class

public class ArrayListExample {
               public static void main(String[] args) {
                              // Create an ArrayList of integers
                              ArrayList<Integer> numbers = new ArrayList<>();
                              // Add five integer elements to the list
                              numbers.add(10);
                              numbers.add(20);
                              numbers.add(30);
                              numbers.add(40);
                              numbers.add(50);
                              // Remove the third element (index 2)
                              numbers.remove(2);
                              // Update the second element (index 1) with a new value
                              numbers.set(1, 25);
                              // Display all the elements using a loop
                              System.out.println("Elements in the ArrayList:");
                              for (int number : numbers) {
                                             System.out.println(number);
                                             }
                              }
}
