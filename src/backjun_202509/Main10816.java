package backjun_202509;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main10816 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new  StringTokenizer(br.readLine());
		
		//숫자,포함개수
		Map<Integer, Integer> cnt = new HashMap<>(N*2);
		
		for(int i=0; i<N; i++) {
			int x = Integer.parseInt(st.nextToken());
			//여기서 바로 몇개를 가지고 있는지 확인하는 거.. 처음의 경우 1로 세팅
			cnt.put(x, cnt.getOrDefault(x, 0)+1);		
		}
		
		int M = Integer.parseInt(br.readLine());
		st = new  StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<M; i++) {
			int x = Integer.parseInt(st.nextToken());
			sb.append(cnt.getOrDefault(x, 0) + " ");
			
		}
		
		System.out.println(sb);

	}

}
