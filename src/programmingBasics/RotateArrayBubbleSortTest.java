package programmingBasics;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RotateArrayBubbleSortTest {
	
	@Test
	public void rotateArray_oneNumber(){
		List<Integer> returnedList = RotateArrayBubbleSort.rotate(new Integer[]{0});
		for(int i = 0; i < returnedList.size(); i++){assertEquals((Object)returnedList.get(i), 0);}	
	}
	
	@Test
	public void rotateArray_evenNumbers(){
		List<Integer> expectedList = new ArrayList<>();
		expectedList.add(0); expectedList.add(1); expectedList.add(3);
		
		List<Integer> returnedList = RotateArrayBubbleSort.rotate(new Integer[]{3, 1, 0});
		
		for(int i = 0; i < returnedList.size(); i++){
			assertEquals((Object)returnedList.get(i), (Object)expectedList.get(i));
		}}
	
	@Test
	public void rotateArray_oddNumbers(){
		List<Integer> expectedList = new ArrayList<>();
		expectedList.add(0); expectedList.add(1); expectedList.add(2); expectedList.add(3);
		
		List<Integer> returnedList = RotateArrayBubbleSort.rotate(new Integer[]{3, 1, 0, 2});
		
		for(int i = 0; i < returnedList.size(); i++){assertEquals((Object)returnedList.get(i), (Object)expectedList.get(i));}}
	
	@Test
	public void rotateArray_oneNegativeNumber(){
		List<Integer> expectedList = new ArrayList<>();
		expectedList.add(-1); expectedList.add(0); expectedList.add(1); expectedList.add(2);
		
		List<Integer> returnedList = RotateArrayBubbleSort.rotate(new Integer[]{2, 1, 0, -1});
		
		for(int i = 0; i < returnedList.size(); i++){assertEquals((Object)returnedList.get(i), (Object)expectedList.get(i));}}
	
	@Test
	public void rotateArray_allNegativeNumbers(){
		List<Integer> expectedList = new ArrayList<>();
		expectedList.add(-200); expectedList.add(-70); expectedList.add(-7); expectedList.add(-1);
		
		List<Integer> returnedList = RotateArrayBubbleSort.rotate(new Integer[]{-200, -7, -70, -1});
		
		for(int i = 0; i < returnedList.size(); i++){assertEquals((Object)returnedList.get(i), (Object)expectedList.get(i));}}
	
	@Test
	public void rotateArray_withNull(){
		List<Integer> expectedList = new ArrayList<>();
		expectedList.add(-200); expectedList.add(-70); expectedList.add(-1); expectedList.add(0);
		
		List<Integer> returnedList = RotateArrayBubbleSort.rotate(new Integer[]{-200, (Integer) null, -70, -1});
		
		for(int i = 0; i < returnedList.size(); i++){assertEquals((Object)returnedList.get(i), (Object)expectedList.get(i));}}	
}
