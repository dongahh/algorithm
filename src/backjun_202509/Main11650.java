package backjun_202509;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main11650 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2]; //배열
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st ;
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken()); //x
			arr[i][1] = Integer.parseInt(st.nextToken()); //y	
		}
		Arrays.sort(arr,(a,b)->{
			if (a[0] == b[0]) return a[1]- a[2];
			return a[0] - b[0];
			
		});
		
		
		for(int i=0; i<N; i++) {
			sb.append(arr[1][0] + " " + arr[i][1] + "\n");
		}
		
		System.out.println(sb);
		
	}

}
