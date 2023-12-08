package it_corperation_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10_4659 {

	 public static void Main(String[] args) throws IOException {
		
	
		//비밀번호 발음하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String password;
		char[] pass;
		
		String acc = "> is acceptable. \n";
		String not = "> is not acceptable. \n";
		
		StringBuilder sb = new StringBuilder();
		
		boolean flag;
		char prev;
		int count;
		
		while (!(password = br.readLine()).equals("end")) {
			
			pass = password.toCharArray();
			prev = '.';
			count = 0;
			
			flag = false;
			
			for(char p : pass) {
				if(isVowel(p)) flag = true;
				
				if(isVowel(p) != isVowel(prev)) count = 1;
				else count ++;
				
				if(count > 2 || ( prev == p && (p != 'e' && p != 'o'))) {
					flag = false;
					break;
				}
				
				prev = p;
			}
					
			if(flag) sb.append('<').append(password).append(acc);
			else sb.append ('<').append(password).append(not);
			
		}
		
			
	 }
	 
	public static boolean isVowel(char ch) {
		return ch == 'a' || ch == 'e' ||  ch == 'i' || ch == 'o' || ch == 'u';
		
	}
		
	
	
}
