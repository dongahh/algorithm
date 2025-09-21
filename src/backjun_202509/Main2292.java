package backjun_202509;

import java.util.Scanner;

public class Main2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner(System.in);
		int N = sc.nextInt();
		
		if (N ==1) {
			System.out.print(N);
			return;
		}
		
		//해당 숫자가 몇 층에 있는 지 찾으면 됨. 
		/*
		 * 1층 1
		 * 2층 6개
		 * 3층 12개
		 * 
		 */

		int floor = 6 * (N);
		System.out.print(5/6);
		
		int layer = 1; //몇번째 층인지
		int maxNum = 1; //그 층에 마지막 숫자
		
		while(maxNum < N) {
			maxNum += 6*layer;
			layer++;
		}
		
		System.out.println(layer);
	}

}
