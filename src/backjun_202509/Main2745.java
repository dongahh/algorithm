package backjun_202509;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2745 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		N진법은  10진법으로 바꾸기 : Integer.parseInt(N,B);
		10진법은  N진법으로 바꾸기 : Integer.toString(num,N);
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String N = st.nextToken();
		int B = Integer.parseInt(st.nextToken()); //진법
		int power = 1;
		int result = 0;
		
		for(int i=N.length(); i>0; i--) {
			char ch = N.charAt(i-1);
			int val;
			
			//각 자리수를 숫자로 변경.
			if(ch>='0' && ch <='9') {
				val = ch - '0'; 
 
			}else {
				val = ch - 'A' + 10;

			}
			
			result += val * power;
			power *= B;
			
		}
		System.out.println(result);
		

	}

}
