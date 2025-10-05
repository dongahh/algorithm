package backjun_202510;

import java.util.Scanner;

public class Main_loop_25314 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt()/4;
		String str = "long ";
		StringBuilder sb = new StringBuilder();
		for(int i =0; i< count; i++) {
			sb.append(str);
		}
		sb.append("int");
		
		System.out.println(sb);

	}
	
}
