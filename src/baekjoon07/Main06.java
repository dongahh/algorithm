package baekjoon07;

public class Main06 {

	public static void main(String[] args) {
		// 2775 : 부회장이 될거야.
		//이중 배열
		
		
		int[][] arr = new int[15][15];
		
		for(int i=0; i<15; i++) {
			arr[0][i]=i;
			arr[i][0]=1;
			
			for(int j=2; j<15; j++) {
				arr[i][j] = arr[i][j-1]+arr[i-1][j];
				
			}
			
			
			
		}

	}

}
