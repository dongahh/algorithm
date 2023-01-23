package baekjoon12;

import java.util.Scanner;

public class Main04 {
	
	public static boolean[][] arr;
	public static int min = 64;

	public static void main(String[] args) {
		// 1018 체스판 다시 칠하기
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		arr = new boolean[n][m];
		sc.nextLine();
		
		
		for(int i=0; i<n; i++) {
			String str = sc.nextLine();
			//System.out.println("Str : " + str);
			for(int j=0; j<m; j++) {
				
				if(str.charAt(j)== 'W') {
					arr[i][j] = true; //W: true				
				}else {
					arr[i][j] = false;
				}
			}		
		}
		
		int n_row = n-7;
		int m_row = m-7;
		
		for(int i=0; i<n_row; i++) {
			for(int j=0; j<m_row; j++) {
				find (i,j);
			}
		}
		System.out.println(min);


	}

	public static void find(int x, int y) {
		
		int count =0; 
		boolean fir = arr[x][y];
		
		for(int i=x; i<x+8; i++) {
			for(int j=y; j<y+8; j++) {
				
				if(arr[i][j] != fir) {//시작 색이 다른 경우?
					count++;
					
				}
				fir = (!fir);
				
			}
			fir = (!fir);
		}
		
		count = Math.min(count, 64-count);
		
		min = Math.min(count, min);
		
	}

}
