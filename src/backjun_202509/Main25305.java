package backjun_202509;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main25305 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int k = sc.nextInt();
		
		int arr[] = new int[N];
		
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		//내림차순 정렬
		Arrays.sort(arr);
		System.out.println(arr[N-k]);
	}

}
