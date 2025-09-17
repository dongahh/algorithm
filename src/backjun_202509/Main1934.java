package backjun_202509;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1934 {
	//16,24

	public static int gcd(int a, int b) {
		
		//최소공배수 = (a*b)/최대공약수
		
		while(b!=0) { //유클리드 호제법으로 최대공약수 찾기
			int tmp = a%b;
			a=b;
			b=tmp;
		}
		return a;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st ;
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			int gcd = gcd(A,B);
			int lcm = (A*B)/gcd;
			System.out.println(lcm);
		}
		

	}

}
