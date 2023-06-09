
public class Assignment9_Recursion_Q2 {
	
	    public static int sumOfNaturals(int n) {
	        int sum = 0;
	        for (int i = 1; i <= n; i++) {
	            sum += i;
	        }
	        return sum;
	    }
	    
	    public static void main(String[] args) {
	        int n = 5;
	        int sum = sumOfNaturals(n);
	        System.out.println(sum);
	    }
	}
