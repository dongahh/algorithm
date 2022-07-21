package baekjoon04;

import java.util.Scanner;

public class Main07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int su = Integer.parseInt(sc.nextLine());
		
		double total[] = new double[su];		
		for(int i=0; i<su; i++) {
			int second = sc.nextInt();
			
			double sum=0;
			int count=0;
			int arr[] = new int[second];
			for(int j=0; i<second; i++) {
				
				arr[j]=sc.nextInt();
				
				
				//평균
				for(int k=0; k<second; k++) {
					sum += arr[k];
				}
				
				
				//평균보다 큰 거 갯수
				for(int k=0; k<second; k++) {
					if((sum/arr.length)<arr[i]) {
						count++;
					}
					
				}
			}
			
			total[i]=(count/arr.length)*100;
		}
		
		for(int i=0; i<su; i++) {
			System.out.printf("%6.3f\n",total[i]);
		}
	}

}
