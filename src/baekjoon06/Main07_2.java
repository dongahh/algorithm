package baekjoon06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main07_2 {

	public static void main(String[] args) throws IOException {
		// 2908번 - 상수
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		StringTokenizer st;
		
		st = new StringTokenizer(input, " ");
		
		int a =  Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int b =  Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		

		System.out.println(a>b ? a : b);
		
		
		

	}

}
