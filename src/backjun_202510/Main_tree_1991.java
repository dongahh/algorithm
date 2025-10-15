package backjun_202510;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_tree_1991 {
	
	//전위 , 중위, 후위로 들어감.
	static int[] left = new int[26];
	static int[] right = new int[26];
	
	static StringBuilder pre = new StringBuilder();
	static StringBuilder in = new StringBuilder();
	static StringBuilder post = new StringBuilder();

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		//초기화 (-1 : 없음)
		for(int i=0; i<26; i++) {
			left[i] = -1;
			right[i] = -1;
		}
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char node = st.nextToken().charAt(0);
			char l = st.nextToken().charAt(0);
			char r = st.nextToken().charAt(0);
			
			int inx = node-'A';
			left[inx] = (l == '.') ? -1 : (l- 'A');
			right[inx] = (r =='.') ? -1 : (r - 'A');
			
		}
		
		preTree(0);
		inTree(0);
		postTree(0);
		
		System.out.println(pre.toString());
		System.out.println(in.toString());
		System.out.println(post.toString());

	}
	
	//전위 순회한 결과 : 루트 - 왼쪽노드 - 오른쪽 노드
	static void preTree(int node) {
		if (node == -1) return;
		
		pre.append((char) (node + 'A'));
		preTree(left[node]);
		preTree(right[node]);
		
		
	}
	
	//중위 순회한 결과 : 왼쪽노드 - 루트 - 오른쪽 노드
	static void inTree(int node) {
		if(node == -1) return;
		
		inTree(left[node]);
		in.append((char)(node + 'A'));
		inTree(right[node]);
	}
	//후위 순회한 결과 :  왼쪽노드 - 오른쪽 노드 - 루트 
	static void postTree(int node) {
		if(node == -1) return;
		
		postTree(left[node]);		
		postTree(right[node]);
		post.append((char)(node + 'A'));
	}

}
