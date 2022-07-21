package baekjoon06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main06 {

	public static void main(String[] args) throws IOException {
		// 1152번 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine().trim();
		
		br.close();
		
		StringTokenizer st;
		
		st = new StringTokenizer(input, " ");
		
		if(st.equals(" ")) {
			System.out.println(0);
		}else {
			System.out.println(st.countTokens());
		}
		
	}
}
