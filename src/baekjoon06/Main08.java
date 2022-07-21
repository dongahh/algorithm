package baekjoon06;

import java.util.Scanner;

public class Main08 {

	public static void main(String[] args) {
		// 5622번 - 다이얼
		
		int arr[] = new int[27];
		
		
		for(int i=1; i<=8; i++) {
			
			if(i==6||i==8) {
				for(int j=i; j<(i+4); j++ ) {
					arr[j] = 2+i;
				}
				
				
			}else {
				for(int j=i; j<(i+3); j++ ) {
					arr[j] = 2+i;
				}
			}
			
		}
		
		
		//입력
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		int sum=0;
		for(int i=0; i<input.length(); i++) {
			int a = input.charAt(i)-'A'+1;
			
			sum +=arr[a];
			System.out.print(a+" ");
			System.out.println(arr[a]);
		}
		
		System.out.println(sum);
		

	}

}
