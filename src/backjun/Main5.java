package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5 {

	public static void main(String[] args) throws Exception {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int su = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=su; i++) {
			System.out.println(i);
		}

	}

}
