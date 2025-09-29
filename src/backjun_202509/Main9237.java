package backjun_202509;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main9237 {
		// TODO Auto-generated method stub
		 public static void main(String[] args) throws IOException {
		        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        
		        int N = Integer.parseInt(br.readLine());
		        int[] tree = new int[N];
		        
		        StringTokenizer st = new StringTokenizer(br.readLine());
		        for (int i = 0; i < N; i++) {
		            tree[i] = Integer.parseInt(st.nextToken());
		        }
		        
		       
		        Arrays.sort(tree); //오름차순 하고... N부터 찾기..
		        int dd = 0;
		        int max = 0;
		        
		        for (int i = N - 1; i >= 0; i--) {
		            dd++;
		            max = Math.max(max, tree[i] + dd);
		        }
		        
		        System.out.println(max + 1); 

	}

}
