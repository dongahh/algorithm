package baekjoon06;

import java.util.Scanner;

public class Main07 {

	public static void main(String[] args) {
		// 2908번 - 상수
		
		Scanner sc = new Scanner(System.in);
		
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		
		int hun1 = input1/100;
		int ten1 = input1/10%10;
		int one1 = input1%10;
		
		int hun2 = input2/100;
		int ten2 = input2/10%10;
		int one2 = input2%10;
		
		int input1_1 = one1*100+ten1*10+hun1;
		int input2_2 = one2*100+ten2*10+hun2;
		
		if(input1_1>input2_2) {
			System.out.println(input1);
		}else {
			System.out.println(input2);
		}
		
	}

}
