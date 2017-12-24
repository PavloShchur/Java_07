package programmingBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArrayIntermediate {

	public static void main(String[] args) { rotate(new Integer[]{0, 1, (Integer) null, 3}, 0); }
	
	public static int[] rotate(Integer[] nums, int k) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(nums));
		
	    if(k > list.size()) k=k%list.size();
	 
	    int[] result = new int[list.size()];
	 
	    for(int i = k; i < list.size(); i++){ 
	    	if ((Integer)list.get(list.size() - 1 - i) != null)
				result[i] = list.get(nums.length - 1 - i);
			else
				result[i] = 0; }
	    
	    System.out.println("result : " + Arrays.toString(result));
	    return result;
	    
	}
}
