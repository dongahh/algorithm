package baekjoon12;

import java.util.Scanner;
public class Main01 {

	public static void main(String[] args) {
		// 2798 블랙잭 _BRUTE fORCE 
		//브루트 포스 :  모든 경우의 수를 대입해서 푸는 방법.
		

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int sum = 0;
		int tmp = 0;
		
		int [] arr = new int [N];
		
		for(int i=0; i<N; i++) {
			arr [i] = sc.nextInt();			
		}
		
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				for(int k=j+1; k<N; k++) {
					sum = arr[i] + arr[j] +arr[k];
					if(tmp < sum && sum <=M) {
						tmp = sum;
					}
				}
			}
		}
		System.out.println(tmp);
	}

}
