package programmingBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArrayBubbleSort {

	public static void main(String[] args) {
		rotate(new Integer[]{});
	}
	
	public static List<Integer> rotate(Integer[] arr) {		
		List<Integer> nulls = new ArrayList<>();
		
		if (arr == null) {
		    throw new IllegalArgumentException("Illegal argument!");
		}
	 
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) == null) {
				nulls.add(list.indexOf(list.get(i)));
				list.set(list.indexOf(list.get(i)), 0);
			} 
		}
		
		 for(int i = 0; i < list.size() - 1; i++){  
             for(int j = 0; j < list.size() - 1 - i; j++){  
                      if(list.get(j) > list.get(j + 1)){  
                             int temp = list.get(j);  
                             list.set(j, list.get(j + 1));  
                             list.set(j + 1, temp);  
                     }  
             }  
	}
		return list;

}}
