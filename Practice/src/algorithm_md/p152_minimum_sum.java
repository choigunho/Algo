package algorithm_md;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;

public class p152_minimum_sum {

	static int Answer;
	static int[] col;
	static int[][] map;
	static int N;
	private static int total;
	
	public static void main(String args[]) throws Exception {
		
		String path = new File("").getAbsoluteFile() + "\\res\\";
		String fileName = "p152_minimum_sum.txt";
		System.setIn(new FileInputStream(path + fileName));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int testCase = 0; testCase < T; testCase++) {
			
			N = sc.nextInt();
			col = new int[N+1];
			map = new int[N+1][N+1];
			
			Answer = 999;
			total = 0;
			
			for(int i=1; i<=N; i++) {
				for(int j=1; j<=N; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			dfs(1);
			
			System.out.println("#" + testCase + " " + Answer);
		}
	}
	
	public static void dfs(int row) {

		if(row > N) {
			if(Answer > total) {
				Answer = total;
			}
		}
		
		for(int i=1; i<=N; i++) {
			if(col[i] == 0) {
				col[i] = 1;
				total += map[row][i];
				
				dfs(row + 1);
				
				col[i] = 0;
				total -= map[row][i];
			}
			
		}
		
	}
}