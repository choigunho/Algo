package algorithm_md;

import java.io.FileInputStream;
import java.util.*;

public class p110_maxValue {

	static int Answer;
	
	public static void main(String args[]) throws Exception {
		
		String path = p110_maxValue.class.getResource("").getPath();
		String fileName = "p110.txt";
		System.setIn(new FileInputStream(path + fileName));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int testCase = 1; testCase <= T; testCase++) {
			
			int n = sc.nextInt();
			
			int[][] l = new int[n+1][n+1];
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					l[i][j] = sc.nextInt();
				}
			}
			
			Answer = 0;
			
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					if(l[i][j] > Answer) {
						Answer = l[i][j];
					}
				}
			}
			
			System.out.println("#" + testCase + " " + Answer);
		}
	}

}