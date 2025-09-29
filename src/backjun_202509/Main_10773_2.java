package backjun_202509;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main_10773_2 {

	public static void main(String[] args) throws IOException {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
	
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0; i<K; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num ==0 && !arr.isEmpty()) {
				arr.remove(arr.size()-1);
			}else {
				arr.add(num);
			}
		}
		
		int sum = 0;
        for (int n : arr) {
            sum += n;
        }

        System.out.println(sum);
	
	}

}
