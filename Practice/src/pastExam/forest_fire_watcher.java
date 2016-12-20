package pastExam;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;

public class forest_fire_watcher {

	static int Answer;
	static int[][] map;
	private static int watcher;

	public static void main(String args[]) throws Exception {
		
//		System.setIn(new FileInputStream("C:\\forest_fire_watcher.txt"));
		System.setIn(new FileInputStream(new File("").getAbsolutePath() + "\\res\\forest_fire_watcher.txt"));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int testCase = 0; testCase < T; testCase++) {
			
			int row = sc.nextInt(); // 5
			int col = sc.nextInt(); // 6
			map = new int[row+2][col+2];
			
			// 2차원 배열로 묘목 지도 생성
			for(int i=1; i<=row; i++) {
				for(int j=1; j<=col; j++) {
					map[i][j] = sc.nextInt();
				}
			}
		
			Answer = 0;
			
			for(int i=1; i<= row; i++) {
				for(int j=1; j<= col; j++) {
					
					if(map[i][j] == 1) {
						
						// 깊이 우선 탐색 수행
						watcher = dfs(i, j); 
						//System.out.println("watchers: " + watcher);
						
						Answer += (watcher + 1)/2;
						
						//System.out.println("required watcher: " + Answer);
						watcher = 0;
					}
				}
			}
			System.out.println("#" + testCase + " " + Answer);
		}
	}
	
	public static int dfs(int r, int c) {

		if(map[r][c] == 1) {
			//System.out.println("map: " + r + " " + c);
			watcher++;
			map[r][c] = 0;

			if(map[r+1][c] == 1 || map[r-1][c] == 1 || map[r][c+1] == 1 || map[r][c-1] == 1) {
				dfs(r+1, c);
				dfs(r-1, c);
				dfs(r, c+1);
				dfs(r, c-1);
			}
		}
		return watcher;
	}
	
}