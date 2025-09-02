package backjun_202509;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

import javax.xml.soap.Node;

public class stack {

	static LinkedList<int[]> q;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			q = new LinkedList<>(); //테스트케이스만큼 큐가 있는거나 다름 없으니, 반복문을 돌릴떄 마다 최화를 해준다.
			st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			for(int i =0; i<N; i++) {
				q.add(new int[] {i,Integer.parseInt(st.nextToken())});
			}
			sb.append(solution(M)).append("\n");
			
			
		}

	}
	//해당 M번쨰 문서가 몇번째로 인쇄되는 지 구하는 메소드
	static int solution(int M) {
		int findIt =0;
		while (!q.isEmpty()) {
			int[] first = q.poll(); //큐의 맨 앞 요소를 뺸다.
			boolean isMax = true;
		
			for(int i=0; i <q.size(); i++) {
				if(first[1] < q.get(i)[1]) {
					q.offer(first);
					
					for(int j=0; j<i; j++) {
						q.offer(q.poll());
					}
				isMax = false;
				break;	

				}
			}
			
			if(isMax == false) { //뽑은 요소보다 큰 요소가 있어서 걸러졌다면 다시 반복문을 
				//제일 큰게 나올떄까지 계속 돌린다. 
				continue;
			}
			findIt++;
			
			if(first[0] == M) {
				break;
			}
			
			
			
			
		}
		
		return findIt;
	}
	
	
	
}

	












