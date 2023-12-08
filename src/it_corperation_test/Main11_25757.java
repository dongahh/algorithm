package it_corperation_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main11_25757 {

	public static void main(String[] args) throws IOException {
		// 25757_미니게임.
		
		new Main11_25757().solution();
	}
	
	private int getPlayerExceptLms(char c) {
		switch(c) {
		case 'Y' : return 2;
		case 'F' : return 3;
		case 'O' : return 4;
		}
		return -1;
		
	}
	
	private void solution() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int p = getPlayerExceptLms(st.nextToken().charAt(0));
		HashSet<String> hs = new HashSet<>();
		int cnt = 0;
		while (n-->0) {
			String our = br.readLine();
			cnt += hs.contains(our)?0:1;
			hs.add(our); //중복으로 안넣어지기 때문에
		}
		System.out.println(cnt/p);
		
	
	
	}

}
