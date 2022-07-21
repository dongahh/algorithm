package baekjoon07;

import java.util.Scanner;

public class Main00 {

	public static void main(String[] args) {
		
		//최대공약수 구하기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a<b) {
			int su = a;
			a=b;
			b=su;
		}
		
		//큰 값 찾기
		while(b!=0) {
			int r=a%b;
			//System.out.println(r);
			a=b;
			b=r;
		}
		
		System.out.println(a);
		
		

	}
	


}
