package pastQuestion;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;

public class forest_fire_watcher {

	static int Answer;
	static int[][] map;

	public static void main(String args[]) throws Exception {
		
		System.setIn(new FileInputStream(new File("").getAbsolutePath() + "\\res\\forest_fire_watcher.txt"));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int testCase = 0; testCase < T; testCase++) {
			
			int row = sc.nextInt(); // 5
			int col = sc.nextInt(); // 6
			map = new int[row+1][col+1];
			
			for(int i=1; i<=row; i++) {
				for(int j=1; j<=col; j++) {
					map[i][j] = sc.nextInt();
				}
			}
		
			dfs(1);
			
			System.out.println("#" + testCase + " " + Answer);
		}
	}
	
	public static void dfs(int row) {

		
	}

}