package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main6 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=num; i>0; i--) {
			System.out.println(i);
		}
		
		/*for(int i=1; i<=num; i++) {
			stack.push(i);
		}
		while(!stack.isEmpty()) {
		System.out.println(stack.pop());
	}*/

	}
}

//35196
//1004