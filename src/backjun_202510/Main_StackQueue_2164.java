package backjun_202510;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_StackQueue_2164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		Queue<Integer> queue = new LinkedList<>();
		//stack 제네릭 데이터는 primivie type 을 사용할 수 없음!!!
		
		//초기 셋팅
		for(int i=1; i<=N; i++) {
			queue.offer(i);
			/* Enqueue
			 * add ()  --> 원소추가 실패시 illegalStateException 발생.
			 * offer() --> 원소추가 실패 시 false 반환 ** 더 자주 사용!
			 * 
			 * Dequeue
			 * remove() --> 맨 앞 원소 제거. 비어있으면 NosuchElementException 발생.
			 * poll()   --> 맨 앞 원소 제거. 버어있으면 null 반환 ** 주로 사용.
			 * 
			 * Peek - 꺼내지 않고 확인만!
			 * element()--> 큐의 맨 앞 원소 확인. 비어있으면 NosuchElementException 발생.
			 * peek()   --> 큐의 맨 앞 원소 제거. 버어있으면 null 반환 ** 주로 사용.
			 */
		}
		
		while(queue.size() >1) {
			queue.poll();
			queue.add(queue.poll());
		}
		
		System.out.println(queue.poll());

	}

}
