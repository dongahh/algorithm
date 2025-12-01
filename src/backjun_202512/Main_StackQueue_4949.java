package backjun_202512;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_StackQueue_4949 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		/*
		 * 문제 point 
		 * 1. stack 문제로 여는 구간인 경우 push 닫는 괄호인 경우 pull
		 * 2. 마지막에 . 온점 하나가 들어온 경우 끝
		 * 
		 * 
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String line ;
		while ((line = br.readLine()) != null) {
			
			//온점 하나가 들어온 경우 끝
			if(line ==".") {
				break;
			}
			if(isTrue(line)) {
				sb.append("Yes").append("\n");
			}else {
				sb.append("No").append("\n");
			}
			
		}
	}
	
	private static boolean isTrue(String str) {
		Stack<Character> stack = new Stack<>();
		for(int i=0; i< str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == '(' || ch == ')') {
				stack.push(ch);
			}else if(ch == ')') {
				if(stack.isEmpty()||stack.pop()!= '(') {
					return false;
				}
			}else if (ch == ']') {
				if(stack.isEmpty()|| stack.pop() != '[') {
					return false;
				}
			}
		}
		//완전비어있어야지 true
		return stack.isEmpty();
	}

}
