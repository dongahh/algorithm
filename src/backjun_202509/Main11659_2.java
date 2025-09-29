package backjun_202509;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11659_2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new  StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int sum =0;
		
		st = new  StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int [][] num = new int[N+1][2]; //배열 + 누적합
		for(int i=1; i<N+1; i++) {
			num[i][0] = Integer.parseInt(st.nextToken());
			num[i][1] = num[i][0] + num[i-1][1];	
			
		}
		
		for(int i=0; i<M; i++) {
			st = new  StringTokenizer(br.readLine());
			 int start = Integer.parseInt(st.nextToken());
			 int end = Integer.parseInt(st.nextToken());
			 
			 sum = num[end][1] - num[start-1][1];
			 
			 System.out.println(sum);
	
		}

	}

}
