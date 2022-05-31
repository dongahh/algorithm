package backjun;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.next());
		
		for(int i=1; i<10; i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
		}
		
		sc.close();
		
		

	}

}
