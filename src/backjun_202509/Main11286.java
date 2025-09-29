package backjun_202509;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main11286 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int num;
		int [][] arr = new int[N][2]; //그냥 값 + 절대값
		
		for(int i=0; i<N; i++) {
			num = Integer.parseInt(br.readLine());
			if(num ==0) {
				if(arr == null) {
					System.out.println(0);
				}else {
					Arrays.sort(arr,(a,b) -> {
						if(a[1] == b[1]) return a[0]-b[0];
						return a[1] - b[1];
						
					});
					System.out.println(arr[0][1]);
				}
				
			}else {
				
			}
		}

	}

}
