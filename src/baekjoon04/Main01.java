package baekjoon04;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = Integer.parseInt(sc.nextLine()); 
		
		int arr[] = new int[num1];
		for(int i=0; i<num1; i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println(arr[0]+" "+arr[arr.length-1]);
		
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int num1 = Integer.parseInt(sc.nextLine()); if(num1>0) { String num2 =
		 * sc.nextLine(); sc.close();
		 * 
		 * StringTokenizer st = new StringTokenizer(num2, " ");;
		 * 
		 * int arr[] = new int[num1]; for(int i=0; i<num1; i++) {
		 * arr[i]=Integer.parseInt(st.nextToken()); }
		 * 
		 * //최소값 int min=10000000; for(int i=0; i<num1; i++) { if(arr[i]<min) {
		 * min=arr[i]; } }
		 * 
		 * //최대값 int max=-1000000; for(int i=0; i<num1; i++) { if(arr[i]>max) {
		 * max=arr[i]; } }
		 * 
		 * System.out.println(min+" "+max);
		 * 
		 * }
		 */
		
	}

}
