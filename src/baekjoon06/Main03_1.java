package baekjoon06;

import java.util.Scanner;

public class Main03_1 {

	public static void main(String[] args) {
		 

		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		for(char i='a'; i<='z'; i++) {
			System.out.print(input.indexOf(i));
		}
	}

}
