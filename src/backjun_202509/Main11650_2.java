package backjun_202509;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main11650_2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		//array에 int[] 정수배열을 넣어줘야함. (1차원)
		ArrayList<int[]> list = new ArrayList<>();
		
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            //2개 배열 객체 생성과 동시에 값에 넣어줌.
            list.add(new int[] {x,y});
            
		}
		
		Collections.sort(list, (a,b)->{
			if(a[0]==b[0]) return a[1]- b[1];
			return a[0] = b[0];
			
		});

		for(int[] p : list) {
			sb.append(p[0] + " " + p[1] + "\n");
		}
		System.out.print(sb);
	}

}
