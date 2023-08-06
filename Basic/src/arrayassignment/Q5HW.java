package arrayassignment;

public class Q5HW {

	public static void main(String[] args) {
		// missing number from array
		int a[] = { 1, 2, 3, 5, 6, 7 };
		System.out.println(missingnumber(a));
//		int expsum=0;
//		int actualsum=0;
//		int n=7;
//		for(int i=0;i<a.length;i++) {
//			actualsum=actualsum+a[i];
//		
//		}
//		for(int i=0;i<=n;i++) {
//			expsum=expsum+i;
//		}
//		
//		int missing= expsum-actualsum;
//		System.out.println(missing);
		
	}

	public static int missingnumber(int[] nums) {
		// TODO Auto-generated method stub
		
		        int arr[] = new int[nums.length + 1];
		        for(int i=0;i<nums.length;i++)
		        {
		            arr[nums[i]] = 1;
		        }
		        for(int i=0;i<arr.length;i++)
		        {
		            if(arr[i] == 0)
		            {
		               return i;
		            }
		        }
		        return 0;
		    }
		
		
	
}
