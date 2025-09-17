package backjun_202509;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main1620 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<String,Integer> Hs = new HashMap<>();
		String[] arr = new String[N+1];
		for(int i=0; i< N; i++) {
			String name = br.readLine();
			Hs.put(name, i+1);
			arr[i+1] = name;
			
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<M; i++) {
			String value = br.readLine();
			if(Character.isDigit(value.charAt(0))) {
				//value값이 숫자로만 이루어져있는지 확인하는 용. (true : 숫자)
				sb.append(arr[Integer.parseInt(value)]).append("\n");
			}else {
				sb.append(Hs.get(value)).append("\n");
			}
		
		}
		System.out.print(sb);
		
	}

}
