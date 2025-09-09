package backjun_202509;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main10815 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		int N ;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		int[] cards = new int[N];
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
			
		}
		
		Arrays.sort(cards);
		int M;
		M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
	
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<M; i++) {
			int target = Integer.parseInt(st.nextToken());
			
			if(Arrays.binarySearch(cards, target) >= 0) {
				sb.append("1 ");
			}else {
				sb.append("0 ");
			}
		}
		
		System.out.print(sb);

	}

}
