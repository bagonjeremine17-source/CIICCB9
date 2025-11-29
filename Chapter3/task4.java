package Chapter3;
 import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        
       
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String originalString = scan.nextLine();

        StringBuilder sb = new StringBuilder(originalString);

        if (isPalindrome(sb.toString())) {
            System.out.println("'" + originalString + "' is a palindrome.");
        } 

        else {
            System.out.println("'" + originalString + "' is not a palindrome.");
        }

        scan.close();
    }
    public static boolean isPalindrome(String str) {
        // Handle case-insensitivity by converting to lowercase
        String cleanString = str.toLowerCase(); 

        int left = 0;
        int right = cleanString.length() - 1;

        while (left < right) {
            if (cleanString.charAt(left) != cleanString.charAt(right)) {
                return false; // Characters don't match, not a palindrome
            }
            left++;
            right--;
        }
        return true;

        
    }
}
    
