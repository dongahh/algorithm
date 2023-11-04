package it_corperation_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TEST_2292  {
	
	/*
	 * 1 : 1  = x 
	 * 2 : 6(2 ~7)  = ((x-1)*6) 
	 * 3 : 12 (8 ~ 19) = 
	 * 4 : 18 (20 ~ 37) = 
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int count = 1; //겹수
		int range = 2; // 각 겹수에서의 최소단위
		
		if(n == 1) {
			
			System.err.println(1);
			
		}else {
			while (range <= n) {
				range += range*6;
				count ++;
				
			}
			
			
			System.err.println(count);
		}
	}
	
}
