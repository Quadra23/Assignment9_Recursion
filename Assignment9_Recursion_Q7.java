

	import java.util.*;

	public class Assignment9_Recursion_Q7 {
	    public static void printPermutations(String str) {
	        // Create a list to store all permutations
	        List<String> permutations = new ArrayList<>();
	        
	        // Call the recursive function to generate permutations
	        generatePermutations(str.toCharArray(), 0, permutations);
	        
	        // Print all permutations
	        for (String permutation : permutations) {
	            System.out.println(permutation);
	        }
	    }
	    
	    private static void generatePermutations(char[] chars, int index, List<String> permutations) {
	        if (index == chars.length - 1) {
	            // Add the current permutation to the list
	            permutations.add(new String(chars));
	        } else {
	            for (int i = index; i < chars.length; i++) {
	                // Swap characters
	                swap(chars, index, i);
	                
	                // Recursively generate permutations
	                generatePermutations(chars, index + 1, permutations);
	                
	                // Revert the swap
	                swap(chars, index, i);
	            }
	        }
	    }
	    
	    private static void swap(char[] chars, int i, int j) {
	        char temp = chars[i];
	        chars[i] = chars[j];
	        chars[j] = temp;
	    }
	    
	    public static void main(String[] args) {
	        String str = "ABC";
	        System.out.println("Permutations of " + str + ":");
	        printPermutations(str);
	    }
	}

