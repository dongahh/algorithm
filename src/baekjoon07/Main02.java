package baekjoon07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main02 {

	public static void main(String[] args) throws IOException {
		// 1193
		
		BufferedReader br= new  BufferedReader(new InputStreamReader(System.in));

		//들어온값
		int input = Integer.parseInt(br.readLine());
		
		//등차수열  라인
		int line=1;
		
		//더해야하는 값
		int count=0;
		
		int sum = 1;
		
		if(input==1) {
			System.out.println(1+"/"+1);
		}else {
			for(int i=2; i<10000000; i++) {
				sum +=i;
				
				if(sum>input) {
					sum = sum-i+1;
					line=i-1;
					int k = input-sum;
					
					if(i%2==0){//짝수 --> 위에서 시간
						System.out.println(line+"/"+(line-k+1));
						
						break;
						
					}else {
						System.out.println((line-k+1)+"/"+line);
						break;
					}
					
				}
			}
		}

		
	}

}
