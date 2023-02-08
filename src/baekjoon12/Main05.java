package baekjoon12;

import java.util.Scanner;

public class Main05 {

	public static void main(String[] args) {
		// 1436 영화감독 숌
		
		//연속 6이 3개여야함. 
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int number = 665;
		String fix = "666";
		
		while(input >0) {
			number ++;
			String s = Integer.toString(number);
			
			if(s.contains(fix)) {
				input --;
			}
		}
		System.out.println(number);	
		

	}

}
