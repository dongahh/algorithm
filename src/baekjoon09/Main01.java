package baekjoon09;
import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		// 2738 행렬 덧셈
		
		Scanner sc = new Scanner(System.in);
		
		Byte N = sc.nextByte();
		Byte M = sc.nextByte();
		
		int [][] A = new int [N][M];
		int [][] B = new int [N][M];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				A[i][j] = sc.nextByte();
			}
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				B[i][j] = sc.nextByte();
			}
		}
		
		//A와 B를 더한다. 
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				 System.out.print(A[i][j] + B[i][j] + " ");
				 
			}
			System.out.println();
		}
	}
		

}