package programmingBasics;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class RotateArrayIntermediateTest {
	
	@Test
	public void rotateArray_oneNumber(){
		int[] testArray = RotateArrayIntermediate.rotate(new Integer[]{0}, 0);
		assertArrayEquals(new int[]{0}, testArray);
	}
	
	@Test
	public void rotateArray_evenNumbers(){
		int[] testArray = RotateArrayIntermediate.rotate(new Integer[]{0, 1, 2}, 0);
		assertArrayEquals(new int[]{2, 1, 0}, testArray);
	}
	
	@Test
	public void rotateArray_oddNumbers(){
		int[] testArray = RotateArrayIntermediate.rotate(new Integer[]{0, 1, 2, 3}, 0);
		assertArrayEquals(new int[]{3, 2, 1, 0}, testArray);
	}
	
	@Test
	public void rotateArray_oneNegativeNumber(){
		int[] testArray = RotateArrayIntermediate.rotate(new Integer[]{0, 1, -2, 3}, 0);
		assertArrayEquals(new int[]{3, -2, 1, 0}, testArray);
	}
	
	@Test
	public void rotateArray_allNegativeNumbers(){
		int[] testArray = RotateArrayIntermediate.rotate(new Integer[]{0, -1, -2, -3}, 0);
		assertArrayEquals(new int[]{-3, -2, -1, 0}, testArray);
	}
	
	@Test
	public void rotateArray_withNull(){
		int[] testArray = RotateArrayIntermediate.rotate(new Integer[]{0, -1, (Integer) null, -3}, 0);
		assertArrayEquals(new int[]{-3, 0, -1, 0}, testArray);
	}

	
}
