package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main7 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=num; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			sb.append("Case #"+i+": "+(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
			
			System.out.println(sb);
		}

	}

}
