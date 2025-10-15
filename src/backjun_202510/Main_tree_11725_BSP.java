package backjun_202510;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.ArrayDeque;

public class Main_tree_11725_BSP {
	
	


	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Integer>[] list = new ArrayList[N+1];
		
		StringTokenizer st;
		StringBuilder sb ;
		
		for(int i=1; i<=N; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i=0; i<N-1; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			list[a].add(b);
			list[b].add(a);
			
		}
		
		int parent  [] = new  int[N+1];
		boolean visit [] = new boolean[N+1];
		
		Queue<Integer> q = new ArrayDeque<>();
		q.add(1);
		visit[1] = true;
		
		while (!q.isEmpty()) {
			int cur = q.poll();
			for(int inx : list[cur]) { 
				//inx 가 ture가 아니라면 inx 는 cur은 inx의 부모가 됨. 
				if(visit[inx]) continue; 
				visit[inx] = true; 
				parent[inx] = cur;
				q.add(inx);
			}
		}
		
		sb = new StringBuilder();
		for(int i=2; i<= N; i++) {
			sb.append(parent[i]).append('\n');
		}
		System.out.print(sb.toString());
		

		
	}

}
