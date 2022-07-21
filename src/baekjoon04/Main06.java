package baekjoon04;

import java.util.Scanner;

public class Main06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//입력 받을 수
		int su = Integer.parseInt(sc.nextLine());
		
		
		String arr[] = new String[su];
		
		
		
		
		for(int i=0; i<su; i++) {
			
			arr[i] = sc.nextLine();
		}
		sc.close();
		
		for(int i=0; i<arr.length; i++) {
			
			int sum=0;
			int o=0;
			
			for(int j=0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j)=='O') {
					o++;										
					
				}else {
					o=0;
					
				}
				sum +=o;									
			}
			System.out.println(sum);
		}
	}

}
