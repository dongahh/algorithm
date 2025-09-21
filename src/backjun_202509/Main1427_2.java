package backjun_202509;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main1427_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String num = sc.next();
		int N = num.length();
		List<Integer> order = new ArrayList<Integer>();
		
		for(int i=0; i<N ; i++) {
			order.add(num.charAt(i)-'0');
			
		}
		
		order.sort(Collections.reverseOrder());
		
		for(int o : order) {
			System.out.print(o);
		}
		
		
	}

}
