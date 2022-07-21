package baekjoon04;

import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		int su3 = sc.nextInt();
		
		String result = Integer.toString(su1*su2*su3);
		System.out.println(result);
		
		sc.close();
		
		for(int i=0; i<10; i++) {
			int count=0;
			for(int j=0; j<result.length(); j++) {
				if((result.charAt(j)-'0')==i) {
					count++;
				}
			}
			
			System.out.println(count);
		}
	}

}
