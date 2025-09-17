package backjun_202509;

import java.util.Scanner;

public class Main1004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			
			int cnt = 0;
			//출발지
			int x1= sc.nextInt();
			int y1= sc.nextInt();
			
			//도착지
			int x2= sc.nextInt();
			int y2= sc.nextInt();
			
			//행성수
			int n = sc.nextInt();
			for(int j=0; j<n; j++) {
				
				//각 행성수 내부에 있는 지 확인.
				int cx= sc.nextInt();
				int cy= sc.nextInt();
				int r = sc.nextInt();
				
				boolean inside1 = contect(x1,y1,cx,cy,r);
				boolean inside2 = contect(x2,y2,cx,cy,r);
				if(inside1 ^ inside2) { //두개중 하나만 안에 있어야 넘어서게 됨.
					cnt ++;
				}
				
				System.out.println(cnt);		
				
			}		
			
		}

	}
	
	public static boolean contect(int x, int y, int cx, int cy, int r) {
		
		int dx = x -cx;
		int dy = y-cy;
		
		return (dx*dx) + (dy*dy) < r*r;
	}

}
