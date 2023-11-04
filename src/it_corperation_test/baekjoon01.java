package it_corperation_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon01 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int H = Integer.valueOf(st.nextToken());
		int W = Integer.valueOf(st.nextToken());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		//ceil 무조건 올려주는 함수.
		//int hi = H /(N+1) + 1; 
		//int wt = W /(M+1) + 1;
		
		int hi = (int)Math.ceil(H/(N+1));
		int wt = (int)Math.ceil(W/(M+1));

		System.out.println(hi*wt);
		
	}


}
