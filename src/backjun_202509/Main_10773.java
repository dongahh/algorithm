package backjun_202509;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_10773 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<K; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num ==0) {
				stack.pop();
				
			}else {
				stack.push(num);
			}
		}
		
		int sum = 0;
		for(int n : stack) {
			sum += n;
		}
		
		System.out.println(sum);
		

	}

}
