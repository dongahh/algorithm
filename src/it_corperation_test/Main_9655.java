package it_corperation_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_9655 {
	/*DP : 다이나믹 프로그래밍 (Dynamic Programming)
	 * 작은 문제들을 단 한번만 풀어야 한다는 것이다. 
	 * 이미 정답을 구한 작은 문제의 결과를 배열에 따로 저장해 나중에 필요할 떄 사용한다. 
	 *   --> 메모리제이션(Memoization)
	 * 
	 * Bottom-up : 작은문제부터 구래서 큰문제를 해결 -> for
	 * Top-down : 재귀함수를 이용해 큰 문제를 풀 때, 작은 문제를 필요호 할때 작은문제 해결
	 * 
	 * 피보나치 수열은 특정한 수를 구하기 위해 그 앞에 있는 숫자와 두 칸 앞있는 숫자의 합을 구하는 문제다. 
	 * 점화식으로 나타내면 fib(1) = 1 , fib(i) = fib(i-1) + fib(i-2);
	 * 
	*/
	
	public static int fibonacci(int n) {
		if(n ==1 | n==2) return 1;
		
		return fibonacci(n-1) + fibonacci(n-2);		
	}
	
	static long[] dp;
	public static void main2() {
		dp = new long[1001];
		dp[1] = 1;
		dp[2] = 1;
		int n = 50;
		int nth_fib = fibonacci(n);
		
		
	}
	

	public static void main(String[] args) throws IOException {
		// 9965 돌게임

		/*
		 * 
			arrayindexoutofboundsexception 오류
			
			
			
			초기에 정해진 배열의 크기보다 더 많은 양의 데이터를 넣고자 할떄 주로 발생한다. 

		 */

		
		/*
		 * BufferedReader (Scanner과 유사)
		 * 
		 * : 100개를 한번에 가져와서 읽는다. 
		 * 
		 * BufferedWriter (System.out.println()과 유사)
		 * 
		 * 
		 * 둘 다 입력된 데이터가 바로 전달되지 않고, 버퍼를 거쳐 전달되므로 데이터 처리 효율성을 높임.
		 * 많은 양의 데이터를 처리할 떄 유리하다.
		 * 
		 * 하지만 BufferReadeer 은 Enter만 경계로 인식하고 받은 데이터의 형식이 Sting으로 고정되기 때문에 가공이 필요함.
		 * 
		 * 
		 * 	import java.io.BufferedReader;
			import java.io.BufferedWriter;
			import java.io.InputStreamReader;
			import java.io.OutputStreamWriter;
		 * 
		 * 
		 */
		
		/*
		 * 이 문제는 1차원 배열로 풀 수 있다. 
		 * dp[] = Math.min(dp[n-1],dp[n-3]) + 1;
		 * 
		 * dp[n]이 홀수면 상근이가 이김.
		 * dp[n]이 짝수이면 상근이가 짐. 
		 * 
		 */
		

		//상근먼저 시작
		//상근 win -> true
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[n];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 1;
		
		for(int i=4; i<=n; i++){
			if((dp[i-1]& dp[i-3]) == 1) {
				dp[i] = 2;
			}else {
				dp[i] = 1;
				
			}
			
		}
		
		/*
		String reuslt = "";
		if(dp[n] == 1) {
			reuslt = "SK";
		}else {
			reuslt = "CY";
		}
		System.out.println(reuslt)
		*/
		System.out.println(dp[n] == 1?"SK":"CY");
	}

}
