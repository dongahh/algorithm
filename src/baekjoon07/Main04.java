package baekjoon07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main04 {

	public static void main(String[] args) throws IOException {
		// 2869 :달팽이
		
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		double B = Integer.parseInt(st.nextToken());
		int C= Integer.parseInt(st.nextToken());
		
		int night = 1;
		
		if(C==A){
			night=1;
		}
		else if(C>=A&& A>B) {
			 night = (int)Math.ceil((C-A)/(A-B)+1);
			
		}
		System.out.println(night);
		
		

	}

}
