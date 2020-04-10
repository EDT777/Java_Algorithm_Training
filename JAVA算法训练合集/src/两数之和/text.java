package 两数之和;

import java.util.Arrays;

public class text {
		
	 public static int[] twoSum(int[] nums, int target) {
		 
		  for (int i = 0; i < nums.length; i++) {
	            for (int j = i + 1; j < nums.length; j++) {
	                if ( target == nums[j]+ nums[i]) {
	                    return new int[] { i, j };
	                }
	            }
	        }
	        throw new IllegalArgumentException("No two sum solution");
	    }


	    
	 
	 public static void main(String[] args) {
		int[] a1 = {1,7,2,15};
		int target =3;
		System.out.println(Arrays.toString(twoSum(a1,target)));
	}
}
