package backjun_202509;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9012 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String str;
		String vps = "()";
		
		for(int i=0; i<N; i++) {
			str = br.readLine();
			
			while(str.contains(vps)) {
				str = str.replace(vps, "");
			}
			
			if(str.equals("")) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}	
			
		}
	}

}
