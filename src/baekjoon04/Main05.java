package baekjoon04;

import java.util.Scanner;

public class Main05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su = sc.nextInt();
		double max=0;
		//int index=0;
		//int count=0;
		double sum=0;
		
		int arr[] = new int[su];
		for(int i=0; i<su; i++) {
			arr[i]=sc.nextInt();
			 //count ++;
			
			if(arr[i]>max) {
				max=arr[i];
				//index=count;				
			}			
		}
		System.out.println(max);
		
		double arr2[] = new double[su];
		for(int i=0; i<su; i++) {
			
				arr2[i]=((arr[i]/max)*100);
			
		}
		//arr2[su-1] = max;
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		for(int i=0; i<su; i++) {
			sum +=arr2[i];
		}

		System.out.println(sum/su);
		
		
		

	}

}
