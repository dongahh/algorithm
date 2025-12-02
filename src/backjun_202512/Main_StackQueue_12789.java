package backjun_202512;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_StackQueue_12789 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int target = 1;
		
		Stack<Integer> line1 = new Stack<>();
		
		for(int i=0; i< N; i++) {
			int cur = Integer.parseInt(st.nextToken());
			while(!line1.isEmpty() && line1.peek() == target) {
				line1.pop();
				target++;
			}
			
			if(cur == target ) {
				target++;
				
			}else {
				line1.push(cur);
			}
		}
		
		while(!line1.isEmpty() && line1.peek() == target) {
			line1.pop();
			target++;
		}
		
		if(target == N+1) {
			System.out.println("Nice");
		}else {
			System.out.println("Sad");
		}

	}

}
