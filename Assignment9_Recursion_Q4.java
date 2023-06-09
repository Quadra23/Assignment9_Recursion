
public class Assignment9_Recursion_Q4 {
	
	    public static int calculateExponent(int N, int P) {
	        int result = 1;
	        for (int i = 1; i <= P; i++) {
	            result *= N;
	        }
	        return result;
	    }
	    
	    public static void main(String[] args) {
	        int N = 5;
	        int P = 2;
	        int exponent = calculateExponent(N, P);
	        System.out.println(exponent);
	    }
	}

