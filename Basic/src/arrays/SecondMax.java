package arrays;

public class SecondMax {

	
	    public static Integer findSecondLargest(int[] arr) {
	        if (arr.length < 2) {
	            return null;
	        }

	        int largest = arr[0];
	        int secondLargest = Integer.MIN_VALUE;

	        for (int num : arr) {
	            if (num > largest) {
	                secondLargest = largest;
	                largest = num;
	            } else if (num > secondLargest && num < largest) {
	                secondLargest = num;
	            }
	        }

	        if (secondLargest == largest || secondLargest == Integer.MIN_VALUE) {
	            return null;
	        } else {
	            return secondLargest;
	        }
	    }

	    public static void main(String[] args) {
	        int[] array = {5, 2, 10, 8, 3,10};
	        Integer secondLargest = findSecondLargest(array);
	        System.out.println(secondLargest);  // Output: 8
	    }
	


}
