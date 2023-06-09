
public class Assignment9_Recursion_Q5 {
	
	    public static int findMax(int[] arr, int startIndex, int endIndex) {
	        if (startIndex == endIndex) {
	            return arr[startIndex];
	        } else {
	            int mid = (startIndex + endIndex) / 2;
	            int leftMax = findMax(arr, startIndex, mid);
	            int rightMax = findMax(arr, mid + 1, endIndex);
	            return Math.max(leftMax, rightMax);
	        }
	    }
	    
	    public static void main(String[] args) {
	        int[] arr = {1, 4, 3, -5, -4, 8, 6};
	        int max = findMax(arr, 0, arr.length - 1);
	        System.out.println(max);
	    }
	}
