package backjun_202509;

import java.util.Arrays;
import java.util.Scanner;

public class Main2587 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int sum =0;
		
		int arr [] = new int[5];
		for(int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		
		System.out.println(sum/arr.length);
		//배열의 length 는 속성임.
		System.out.println(arr[Math.round(arr.length/2)]);
	}

}
