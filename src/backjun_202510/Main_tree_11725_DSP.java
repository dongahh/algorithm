package backjun_202510;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class Main_tree_11725_DSP {
	
	static ArrayList<Integer>[] list;
	static boolean[] visited;
	static int[] parent;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		list = new ArrayList[N+1];
		//각 ArratList 객치를 생성시켜줌 .
		for(int i=1; i<=N; i++) {
			list[i] = new ArrayList<>();
		}
		
		
		for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b); //양쪽으로 넣어줌,
            list[b].add(a);
        }
		
		 parent = new int[N + 1];
	     visited = new boolean[N + 1];

	     dfs(1);
	     StringBuilder sb = new StringBuilder();
	        for (int i = 2; i <= N; i++) {
	            sb.append(parent[i]).append('\n');
	        }
	        System.out.print(sb);
		
	}
	
	static void dfs(int node ) {
		visited[node] = true;
		for(int i : list[node]) {
			if(!visited[i]) {
				parent[i] = node;
				dfs(i);
			}
		}
		
	}

}
