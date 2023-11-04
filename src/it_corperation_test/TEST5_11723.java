package it_corperation_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TEST5_11723 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//11723_집합
		/*
		 * 비트마스크
		 * 1. Array사용
		 * boolean[] array1 = {1, 0, 0, 0};
		 * boolean[] array2 = {1, 1, 0, 0};
		 * boolean[] array3 = {0, 0, 1, 1};
		 * 
		 * 2. 비트마스크 사용
		 * {0} -> 1000
		 * {0,1} -> 1100
		 * {2,3} -> 0011
		 * 
		 * -> 비트마스크 사용 시 메모리 사용이 줄어든것을 볼 수 있다. 
		 * 
		 * and & : 모두가 1일때, 1 반환
		 * or | : 하나라도 1이면, 1반환
		 * xor ^ : 두 비트가 다르면 1반환
		 * nor ~ : 비트값을 반전
		 * shift >> << : 왼쪽 또는 오른쪽으로 비트를 이동
		 * 
		 * --활용1
		 * bit = 1010
		 * bit = bit | (1 << 2) => 1110
		 * --활용2
		 */
		
		/*
		 * add (1<<i) or  bit 
		 * remove (1<<i) ~ & bit
		 * check if((1<<x) and != 0) 존재
		 * toggle : (1<<x) ~ 
		 */
		
		
		/*
		 * Sting 같은 경우 변경 불가능한 문자이기 때문에 추가되는 문자열이 생길떄마다 메모리를 잡아먹는다. 
		 * 
		 * StringBuilder : 변경 가능한 문자열을 만들어주기 때문에 메모리 사용에 효과적이다. 
		 * String 에 StringBuilder를 그대로 넣을 순 없다. toString으로 변경해 준뒤에 넣어줄 수 있ㅇ.ㅁ
		 * 
		 * 예
		 * StringBuilder stringBuilder = new StringBuilder();
		 * stringBUilder.append("문자열").append("연결");
		 * 
		 * String str = stringBuilder.toSting();
		 * System.out.println(stringBuilder);
		 * System.out.println(str);
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int s  = 0;
		int m = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		while(m-- >0) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
			switch(str) {
			
			case "all" :
				s = (1<<21) -1;
				break;
			case "empty" : 
				s = 0;
			case "add" :
				//s = s &(1<<num);
			
			}
			
			
		}
		
	
		

	}

}
