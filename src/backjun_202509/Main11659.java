package backjun_202509;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11659 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		
		
		int [] num  = new int[N];
		st =  new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			num[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int j=0;j<M; j++) {
			st =  new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			int sum = 0;
			
			for(int p=s; p<s+l; p++) {
				sum += num[p];
			}
			System.out.println(sum);
		}
	}

}
