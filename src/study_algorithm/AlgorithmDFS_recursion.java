package study_algorithm;

public class AlgorithmDFS_recursion {
	
			// DFS 알고리즘 작성 
	
			//1. 재귀 (Recursion)
			
			//방문 처리에 사용할 배열선언
			static boolean[] visited = new boolean[9];
			
			static int [][] graph = {{},{2,3,8},{1,6,8},{1,5},{5,7},{3,4,7},{2},{4,5},{1,2}};
			
			

	public static void main(String[] args) {
		dfs(1);

	}
	
	static void dfs(int nodeIndex) {
		//방문처리
		visited[nodeIndex] = true;
		
		//방문 노드 출력
		System.out.println(nodeIndex + ">>");
		
		//방문한 노드에 인접한 노드 찾기
		for(int node : graph[nodeIndex]){
			//인접한 노득 방문한 적이 없다면 dfs 수행
			
			System.out.println("graph>>" +graph[nodeIndex]);
			//graph[nodeIndex]는 주소값을 의미
			
			if(!visited[node]) {
				dfs(node);				
			}			
		}
		
		
	}

}
