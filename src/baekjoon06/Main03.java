package baekjoon06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main03 {

	public static void main(String[] args) throws IOException {

		//10809번 - 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		br.close();
		
		//초기값을 줌.
		int arr[] = new int[26];
		for(int i=0; i<26; i++) {
			arr[i]=-1;
		}
		
		for(int i=0; i<input.length(); i++) {
			
			char alpa = input.charAt(i);
			
			if(arr[alpa-'a']==-1) {
				arr[alpa-'a']=i;
			}
			
		}
		
		for(int val:arr) {
			System.out.print(val+" ");
		}
		
		
	}

}
