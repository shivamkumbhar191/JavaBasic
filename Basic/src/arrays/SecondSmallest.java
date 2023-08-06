package arrays;

public class SecondSmallest {
	
	    private static final int INIT_VALUE = Integer.MAX_VALUE;

	    public static Integer findSecondSmallest(int[] arr) {
	        if (arr.length < 2) {
	            return null;
	        }

	        int smallest = arr[0];
	        int secondSmallest = INIT_VALUE;

	        for (int num : arr) {
	            if (num < smallest) {
	                secondSmallest = smallest;
	                smallest = num;
	            } else if (num < secondSmallest && num > smallest) {
	                secondSmallest = num;
	            }
	        }

	        if (secondSmallest == smallest || secondSmallest == INIT_VALUE) {
	            return null;
	        } else {
	            return secondSmallest;
	        }
	    }

	    public static void main(String[] args) {
	        int[] array = {5, 2, 10, 2,8, 3};
	        Integer secondSmallest = findSecondSmallest(array);
	        System.out.println(secondSmallest);  // Output: 3
	    }
	}



