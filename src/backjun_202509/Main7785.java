package backjun_202509;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main7785 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String name ;
		String inOut;
		StringTokenizer st;
		
		HashSet<String> hash = new HashSet<>();
		for(int i=0 ;i<N; i++) {
			st  = new StringTokenizer(br.readLine());
			name = st.nextToken();
			inOut = st.nextToken();
			if(inOut.equals("enter")) {
				hash.add(name);
			}else if(inOut.equals("leave")) {
				hash.remove(name);
				
			}
		}
		
		//hashset 정열.. >> List로 변환
		List<String> result = new ArrayList<>(hash);
		
		Collections.sort(result,Collections.reverseOrder());
		
		StringBuilder sb = new StringBuilder();
		
		for(String nm: result) {
			sb.append(nm).append("\n");
			
			
		}
		System.out.print(sb);
		
		

	}

}
