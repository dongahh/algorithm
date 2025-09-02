package backjun_202509;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10798 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String [] arr =  new String[5];
	int maxLen =0;
	
	//가장 긴 값을 찾아주기
	for(int i=0; i<5 ; i++) {
		arr[i] = br.readLine();
		maxLen = Math.max(maxLen, arr[i].length());
		
	}
	
	StringBuilder sb = new StringBuilder();
	
	//세로 읽기
	for(int col=0; col<maxLen; col++) {
		for( int row =0; row < 5; row ++) {
			if(col<arr[row].length()) {
				sb.append(arr[row].charAt(col));
				//charAt을 사용해서 한 글자씩 가져오기, 후에 toString 으로 하기
			}
			
		}
		
	}
	
	System.out.println(sb.toString());
		
		
	}

}
