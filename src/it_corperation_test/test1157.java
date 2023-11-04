package it_corperation_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class test1157 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String words =  br.readLine().toUpperCase();
		
		int [] arr = new int [26]; // 26 단어
		
		int n = 0;
		while (n < words.length()) {
			int num = words.charAt(n) - 'A';
			arr[num] ++;
			//System.out.println(num);
			n ++;
		}
		//a = 65 
		//z = 90
		
		int max = 0 ;
		char ch = '?';
		for(int i=0; i<26; i++) {
			if(max < arr[i]) {
				max = arr[i];
				ch = (char)(i+65);
						
			}else if(max == arr[i]) {
				 ch = '?';
			}
		}
		System.out.println(ch);

		
		
		
		
		
	}
	
		

}
