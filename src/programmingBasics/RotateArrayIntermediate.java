package programmingBasics;

import java.util.Arrays;

public class RotateArrayIntermediate {

	public static void main(String[] args) {
		rotate(new int[]{0, 1, 2}, 0);
	}
	
	public static void rotate(int[] nums, int k) {
	    if(k > nums.length) 
	        k=k%nums.length;
	 
	    int[] result = new int[nums.length];
	 
	    for(int i=0; i < k; i++){
	        result[i] = nums[nums.length-k+i];
	    }
	 
	    int j = 0;
	    for(int i=k; i<nums.length; i++){
	        result[i] = nums[j];
	        j++;
	    }
	 
	    System.arraycopy( result, 0, nums, 0, nums.length );
	    
	    System.out.println(Arrays.toString(result));
	}
}
