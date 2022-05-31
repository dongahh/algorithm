package backjun;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int su = sc.nextInt();
		int arr[] = new int[su];
		
		for(int i=0; i<su;i++) {
			int a =sc.nextInt();
			int b =sc.nextInt();
			
			arr[i] = a+b;
		}
		sc.close();
		for(int k: arr) {
			System.out.println(k);
			
		}

	}

}
