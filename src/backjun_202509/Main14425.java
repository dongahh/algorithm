package backjun_202509;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main14425 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int count = 0;
		
		HashSet<String> hash = new HashSet<String>();
		
		for(int i=0; i<N; i++) {
			hash.add(br.readLine());
		}
		
		
		for(int i=0; i<M; i++) {
			if (hash.contains(br.readLine())) {
				count++;
				
			}
		}
		
		System.out.print(count);

		
	}

}
