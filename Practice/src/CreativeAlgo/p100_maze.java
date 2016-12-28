package CreativeAlgo;

import java.io.FileInputStream;
import java.util.*;

public class p100_maze {

	static int Answer;
	static int h, w;
	private static char[][] map;
	
	public static void main(String args[]) throws Exception {
		
		String path = p100_maze.class.getResource("").getPath();
		String fileName = "p100_maze.txt";
		System.setIn(new FileInputStream(path + fileName));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int testCase = 0; testCase < T; testCase++) {
			
			h = sc.nextInt();
			w = sc.nextInt();
			
			map = new char[h+1][w+1];
			for(int i=0; i<h; i++) {
				String line = sc.next();
				for(int j=0; j<w; j++) {
					map[i][j] = line.charAt(j);
				}
			}
			
			dfs(0, 1);
			
			System.out.println("#" + testCase + " " + Answer);
		}
	}
	
	public static void dfs(int row, int col) {
		
		if(map[row][col] == 'G') {
			System.out.println("dfdfd");
		}
		
		map[row][col] = 'x';
		
		
		
			if(map[row+1][col] == '.' || map[row-1][col] == '.' || map[row][col+1] == '.' || map[row][col-1] == '.') {
				System.out.println(row+1 + " " + col);
				System.out.println(row-1 + " " + col);
				System.out.println(row + " " + (col+1));
				System.out.println(row + " " + (col-1));
				dfs(row+1, col);
				dfs(row-1, col);
				dfs(row, col+1);
				dfs(row, col-1);
				
				map[row+1][col] = '.';
				map[row-1][col] = '.';
				map[row][col+1] = '.';
				map[row][col-1] = '.';
				
			} else if(map[row+1][col] == 'G') {
				System.out.println("bingo!");
				return;
			}
		
				
		/*
		if(row+1 < h) {
			if(map[row+1][col] == '.') {
				System.out.println(row+1 + " " + col);
				dfs(row+1, col);
				
				map[row+1][col] = '.';
			} else if(map[row+1][col] == 'G') {
				System.out.println("bingo!");
				return;
			}
		}
		
		if(row-1 > h) {
			if(map[row-1][col] == '.') {
				System.out.println(row-1 + " " + col);
				dfs(row-1, col);
				
				map[row-1][col] = '.';
			}
		}
			
		if(col+1 < w) {
			if(map[row][col+1] == '.') {
				System.out.println(row + " " + (col+1));
				dfs(row, col+1);
				
				map[row][col+1] = '.';
			}
		}	
			
		if(col-1 > w) {
			if(map[row][col-1] == '.') {
				System.out.println(row + " " + (col-1));
				dfs(row, col-1);
				
				map[row][col-1] = '.';
			}
		}	
		*/
		
	}
	
}