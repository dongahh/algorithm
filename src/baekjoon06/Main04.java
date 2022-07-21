package baekjoon06;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main04 {

	public static void main(String[] args) {
		// 2675 문자열 반복
		
		Scanner sc = new Scanner(System.in);
		
		//첫번째 입력받은 숫자.
		int input = Integer.parseInt(sc.nextLine());
		
		StringTokenizer st;
		
		//입력
		String arr[] = new String[input];
		for(int i=0; i<input; i++) {
			arr[i] = sc.nextLine();
		}
		
		//출력
		for(int i=0; i<input; i++) {
			
		
			st = new StringTokenizer(arr[i], " ");
			
			int su = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			
			for(int j=0; j<str.length(); j++) {
				for(int k=0; k<su; k++) {
					System.out.print(str.charAt(j));
				}
				
				
			}
			System.out.println();
		}
		
	}

}
