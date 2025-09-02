package backjun_202509;

import java.util.Arrays;
import java.util.Scanner;


public class Main2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		for(int i=0 ; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int num : arr) {
			System.out.println(num);
		}
	}

}
