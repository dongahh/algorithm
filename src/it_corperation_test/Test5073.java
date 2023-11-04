package it_corperation_test;

import java.util.Arrays;

public class Test5073 {

	public static void main(String[] args) {
		
		String result = "";
		int a = 1;
		int b = 1;
		int c = 1;
		
		int[] arr = {a,b,c};
		Arrays.sort(arr);
		
		if(arr[2] >= arr[0]+arr[1]) {
			result = "Invalid";
		}else if(arr[2] == arr[0] && arr[0]== arr[1]) {
			result = "Equilateral";
		}else if(arr[2] == arr[1] || arr[0]== arr[1]) {
			result = "Isosceles";
		}else {
			result = "Scalene";
		}
		
		

	}

}
