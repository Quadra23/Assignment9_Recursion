
public class Assignment9_Recursion_Q8 {
	
	    public static int getProduct(int[] arr) {
	        int product = 1;
	        
	        for (int i = 0; i < arr.length; i++) {
	            product *= arr[i];
	        }
	        
	        return product;
	    }
	    
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};
	        int result = getProduct(arr);
	        System.out.println("Product: " + result);
	    }
	}
