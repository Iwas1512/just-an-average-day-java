//Anlil Iwas


package org.example;

public class App {
    

    public static void main(String[] args) {
        int[] numbers = {7, 2, 9, 4, 13, 5, 1, 8};
        
        System.out.println("Array: [7, 2, 9, 4, 13, 5, 1, 8]");
        System.out.println("\nUsing For Loop:");
        System.out.println("Maximum: " + ArrayOperations.maximumUsingForLoop(numbers));
        System.out.println("Minimum: " + ArrayOperations.minimumUsingForLoop(numbers));
        System.out.println("Sum: " + ArrayOperations.sumUsingForLoop(numbers));
        System.out.println("Average: " + ArrayOperations.averageUsingForLoop(numbers));
        
        System.out.println("\nUsing Java Streams:");
        System.out.println("Maximum: " + ArrayOperations.maximumUsingStream(numbers));
        System.out.println("Minimum: " + ArrayOperations.minimumUsingStream(numbers));
        System.out.println("Sum: " + ArrayOperations.sumUsingStream(numbers));
        System.out.println("Average: " + ArrayOperations.averageUsingStream(numbers));
        
        // Test with empty array
        int[] emptyArray = {};
        System.out.println("\nEmpty Array Test:");
        System.out.println("Maximum (For Loop): " + ArrayOperations.maximumUsingForLoop(emptyArray));
        System.out.println("Maximum (Stream): " + ArrayOperations.maximumUsingStream(emptyArray));
    }
}
     
    

