package backjun_202509;

import java.util.Scanner;

public class Main2702 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		
		
		for(int i=0;i<N; i++) {
			int cent = sc.nextInt();
			
			int coins []  = {25,10,5,1};
			
			int[] cnt = new int[4];
			
 			
			for(int j=0; j< cnt.length; j++) {
				cnt[j] = cent/coins[j];
				cent %= coins[j];
			}
			
			//출력
			for(int count : cnt) {
				System.out.print(count + " ");
			}
			System.out.print("\n");
		

			
		}
		sc.close();
		
	}
	
	

}
