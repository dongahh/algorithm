package baekjoon04;

import java.util.Scanner;

public class Main04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int []arr = new int[10];		
		int count=0;
		boolean bl = false;
		
		for(int i=0; i<10; i++) {
			
			arr[i]=(sc.nextInt()%42);
			//int copy=arr[i];
			
			for(int j=0; j<i; j++ ) {
				if(arr[i]==arr[j]) {
					
					bl = true;
					break;
				}
			}
			if(bl==false) {
				count++;
			}
		}
		System.out.println(count);

	}

}
