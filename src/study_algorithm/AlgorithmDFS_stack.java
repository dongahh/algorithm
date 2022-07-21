package study_algorithm;

import java.util.Stack;

public class AlgorithmDFS_stack {
	
	// DFS stack 구조로 
	
	//방문처리 
	static boolean[] visited = new boolean[9];
	
	//인덱스가 노드 번호가 될 수 있도록 함.
	static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
	
	static Stack<Integer> stack = new Stack<>();


	public static void main(String[] args) {
		stack.push(1);
		
		visited[1]=true;
		
		while(!stack.empty()) {
			
			int nodeIndex = stack.pop();
			
			System.out.println(nodeIndex+">>");
			
			//꺼낸 노드와 인접한 노드 찾기
			for(int node:graph[nodeIndex]) {
				
				//인접한 노드가 방문하지 않았을 경우 스택에 넣고 방문처리
				if(!visited[node]) {
					stack.push(node);
					visited[node]=true;					
				}				
			}			
		}	
	}
	
	

}
