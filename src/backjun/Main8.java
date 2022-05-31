package backjun;

import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int input = Integer.parseInt(sc.nextLine());
		
		double percent[] = new double[input];
		
		for(int i=0; i<input; i++) {
			int su = sc.nextInt();
			
			int sum=0;
			double avg=0.0; 
			double count=0;
			
			int arr[] = new int[su];
			for(int j=0; j<su; j++) {
				arr[j]=sc.nextInt();
				
				//합구하기
				sum+=arr[j];
			}
			
			avg= sum/su*1.0;
			System.out.println("avg>>" +avg);
			
			//평균이상인거 갯수
			for(int k=0; k<su; k++) {
				if(arr[k]>avg) {
					count++;
				}
			}
			System.out.println("count>>"+count);
			System.out.println("su>>"+su);
			
			//평균을 넘는 사람의 비율
			percent[i]=(count/su)*100;
			
			System.out.println(count/su*100);
			
			
		}
		
		for(double k:percent) {
			System.out.printf("%.3f%%\n",k);
		}
		
	}

}
