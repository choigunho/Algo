package algorithm_md;

import java.io.FileInputStream;
import java.util.*;

public class p125_fishingboat {

	static int Answer;
	
	public static void main(String args[]) throws Exception {
		
		String path = p125_fishingboat.class.getResource("").getPath();
		String fileName = "p125.txt";
		System.setIn(new FileInputStream(path + fileName));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int testCase = 1; testCase <= T; testCase++) {
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int W = sc.nextInt();
			int H = sc.nextInt();
			
			int[][] pond = new int[N][M];
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					pond[i][j] = sc.nextInt();
				}
			}
			
			
			
			System.out.println("#" + testCase + " " + Answer);
		}
	}

}