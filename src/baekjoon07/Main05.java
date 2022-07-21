package baekjoon07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main05 {

	public static void main(String[] args) throws Exception {
		// 10250 호텔
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int height;
		int weight;
		int input;
		for(int i=0; i<num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			height = Integer.parseInt(st.nextToken());
			weight = Integer.parseInt(st.nextToken());
			input = Integer.parseInt(st.nextToken());
			
			
			System.out.println((input%height)*100+(input/height+1));
			
				
			
			
		}

	}

}
