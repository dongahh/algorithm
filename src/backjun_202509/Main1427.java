package backjun_202509;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main1427 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		
		char[] arr = num.toCharArray();
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(int i=arr.length; i>0; i--) {
			sb.append(arr[i]);
		}
		
		System.out.println(sb);
		
	}

}
