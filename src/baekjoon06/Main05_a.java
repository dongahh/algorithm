package baekjoon06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main05_a {

	public static void main(String[] args) throws IOException {
		// 1157번 - 단어공부
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine().toUpperCase();
		
		br.close();
		
		int arr[] = new int[26];
		
		for(int i=0; i<input.length(); i++) {
			
			char alpa = input.charAt(i);
			
			for(char j='A'; j<='Z'; j++ ) {
				if(alpa==j) {
					arr[j-'A'] ++;
				}
			}
		}
		
		int max=0;
		for(int i=0; i<26; i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		

	}

}
