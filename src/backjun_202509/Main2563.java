package backjun_202509;

import java.util.Scanner;

public class Main2563 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int [][]sum= new int[100][100];
		int erea =0;
		
		
		for( int i=0; i<N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for(int j=x; j<x+10; j++) {
				for(int p=y; p< y+10; p++ ) {
					sum[j][p] = 1;
				}
			}
			
		}
		for(int j=0; j<100; j++) {
			for(int p=0; p< 100; p++ ) {
				if (sum[j][p] == 1) {
					erea ++;
				}
			}
		}
		
		System.out.print(erea);

	}

}
