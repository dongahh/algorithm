package backjun_202509;

import java.util.Scanner;

public class Mixnum2566 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[9][9];
		
		int max = -1;
		int row = 0;
		int col = 0;
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				arr[i][j] = sc.nextInt();
				
				if(max < arr[i][j]) {
					max = arr[i][j];
					row = i+1;
					col = j+1;
				}
					
			}
		}
		System.out.println(max);
		System.out.println(row + " " + col);
		
	}

}
