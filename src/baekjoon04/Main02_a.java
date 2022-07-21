package baekjoon04;


import java.util.Scanner;

public class Main02_a {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int max=0;
		int index=0;
		int count =0;
		
		int arr[] = new int[9];
		for(int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
			}
		sc.close();		
		
		for(int k:arr) {
			count++;
			
			if(k>max) {
				max=k;
				index=count;
			}
		}
		
		System.out.println(max+" "+index);
		
		
		

	}

}
