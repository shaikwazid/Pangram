package Pangram;
import java.util.*;

public class PangramProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a sentence: ");
	        String input = scanner.nextLine();
	        scanner.close();

	        if (isPangram(input)) {
	            System.out.println("The input is a pangram.");
	        } else {
	            System.out.println("The input is not a pangram.");
	        }
	    }

	    public static boolean isPangram(String input) {
	        // Create a boolean array to mark the presence of each letter in the alphabet
	        boolean[] alphabetPresent = new boolean[26];

	        // Convert the input to lowercase to make it case-insensitive
	        input = input.toLowerCase();

	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);
	            if (c >= 'a' && c <= 'z') {
	                int index = c - 'a';
	                alphabetPresent[index] = true;
	            }
	        }

	        // Check if all letters from 'a' to 'z' are present
	        for (boolean present : alphabetPresent) {
	            if (!present) {
	                return false;
	            }
	        }

	        return true;
	}

}
