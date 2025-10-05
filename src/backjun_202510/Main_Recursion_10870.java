package backjun_202510;

import java.util.Scanner;

public class Main_Recursion_10870 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int arr [] = new int[20];
		
		arr[0] = 0;
		arr[1] = 1;
		for(int i =2; i< 20; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		System.out.println(arr[N]);
		
		
	}

}
