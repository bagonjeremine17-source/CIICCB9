import java.util.Scanner;

import java.util.Arrays;


public class BonusTask {

  /* 
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


    System.out.print("Input Number: ");
        int num = scan.nextInt();


    if (num >= 0 && num<arr.length ) {

        System.out.println(arr[num]);
        




    }

  


    



    
}

*/

public static void main(String[] args) {
        // Sample array
        int[] array = {1, 2, 3, 4, 5};
        
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the index of the array (0 to " + (array.length - 1) + "): ");
        
        try {
            // Read the integer input
            int index = scanner.nextInt();
            
            // Check if the index is within bounds
            if (index >= 0 && index < array.length) {
                System.out.println("Element at index " + index + " is: " + array[index]);
            } else {
                System.out.println("Error: Index out of bounds. Please enter a value between 0 and " + (array.length - 1));
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }

    
}
