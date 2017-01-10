package algorithm_md;

import java.io.FileInputStream;
import java.util.*;

public class p100_maze_by_dfs {

	static int Answer;
	static int h, w;
	private static char[][] map;
	private static int count, result;
	
	public static void main(String args[]) throws Exception {
		
		String path = p100_maze_by_dfs.class.getResource("").getPath();
		String fileName = "p100_maze.txt";
		System.setIn(new FileInputStream(path + fileName));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int testCase = 0; testCase < T; testCase++) {
			
			System.out.println("###### testCase " + testCase + " ############");
			
			h = sc.nextInt();
			w = sc.nextInt();
			
			map = new char[h+2][w+2];
			for(int i=1; i<=h; i++) {
				String line = sc.next();
				for(int j=1; j<=w; j++) {
					map[i][j] = line.charAt(j-1);
				}
			}
			count = 0;
			result = 999;
			dfs(1, 2);
			
			if(result == 999) {
				result = 0;
			}
			System.out.println("#" + testCase + " " + (result-1));
		}
	}
	
	public static void dfs(int row, int col) {
		
		count++;
		System.out.println(row + " " + col + " count: " + count);
		
		if(map[row][col] == 'G') {
			System.out.println("reached! count: " + count);
			if(result > count) {
				result = count;
			}
		}
		
		map[row][col] = 'x';
				
		if(map[row+1][col] == '.') {
			dfs(row+1, col);
			map[row+1][col] = '.';
			count--;
		} else if(map[row+1][col] == 'G') {
			dfs(row+1, col);
			map[row+1][col] = 'G';
			count--;
		}
	
		if(map[row-1][col] == '.') {
			dfs(row-1, col);
			map[row-1][col] = '.';
			count--;
		} else if(map[row-1][col] == 'G') {
			dfs(row-1, col);
			map[row-1][col] = 'G';
			count--;
		}
		
		if(map[row][col+1] == '.') {
			dfs(row, col+1);
			map[row][col+1] = '.';
			count--;
		} else if(map[row][col+1] == 'G') {
			dfs(row, col+1);
			map[row][col+1] = 'G';
			count--;
		}
		
		if(map[row][col-1] == '.') {
			dfs(row, col-1);
			map[row][col-1] = '.';
			count--;
		} else if(map[row][col-1] == 'G') {
			dfs(row, col-1);
			map[row][col-1] = 'G';
			count--;
		}
		
	}
	
}