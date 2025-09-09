package backjun_202509;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main10815_01 {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		/*hashSet : 
		중복없는 데이터 집합으로 같은 값을 여러번 넣어도 한 번만 저장됨.
		순서는 없고 탐색속도는 빠르다.
		set.contain(5) : true (포함되어있으면)
		
		*/
		HashSet<Integer> card = new HashSet<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i<N; i++) {
			card.add(Integer.parseInt(st.nextToken()));
			
		}
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<M; i++) {
			if (card.contains(Integer.parseInt(st.nextToken()))) {
				sb.append("1 ");
				
			}else {
				sb.append("0 ");
			}
			
		}
		 System.out.println(sb);
		
		
	}

}
