
public class Assignment9_Recursion_Q1 {
	
	    public static boolean isPowerOfTwo(int n) {
	        if (n <= 0) {
	            return false;
	        }
	        
	        while (n > 1) {
	            if (n % 2 != 0) {
	                return false;
	            }
	            n /= 2;
	        }
	        
	        return true;
	    }
	    
	    public static void main(String[] args) {
	        int n = 16;
	        boolean isPower = isPowerOfTwo(n);
	        System.out.println(isPower);
	    }
	}
