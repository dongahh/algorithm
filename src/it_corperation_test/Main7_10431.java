package it_corperation_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main7_10431 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 10431 줄세우기
		
		int total = 20;
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1; i<n+1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] num = new int[20];
			int cnt = 0;
			for(int j=0; j<20; j++) {
				num[j] = Integer.parseInt(st.nextToken());
				
			}
			
			for(int j=0; j<20; j++) {
				for(int k=0; k<j; k++) {
					if(num[k]<num[j]) cnt ++;
				}
			}
			System.out.println(i + " " + cnt);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
