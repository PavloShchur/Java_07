package programmingBasics;

import java.util.Arrays;

public class InvertRec {
	
	public static void main(String[] args) {
		invertRecString("", 0);
	}

	public static void invertRecNumber(int[] data, int k){
		if(k < data.length / 2){
			int temp = data[k];
			data[k] = data[data.length - 1 - k];
			data[data.length - 1 - k] = temp;
			invertRecNumber(data, k + 1);
			System.out.println("data = " + Arrays.toString(data));
		}
	}
	
	public static void invertRecString(String data, int k){
		if(data.isEmpty()) return;
		char[] string = data.toCharArray();	
		if(k < string.length / 2){
			char temp = string[k];
			string[k] = string[data.length() - 1 - k];
			string[data.length() - 1 - k] = temp;
			invertRecString(data, k + 1);
			System.out.println("data = " + Arrays.toString(string));
		}
	}
}
