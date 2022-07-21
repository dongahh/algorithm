package baekjoon07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main01 {

	public static void main(String[] args) throws IOException {
		//1712 손익분기점
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		br.close();
				
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int price=-1;
		
		if(C>B) {
			price = A/(C-B)+1;
		}
		
		System.out.println(price);

	}

}
