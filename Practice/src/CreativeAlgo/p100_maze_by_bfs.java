package CreativeAlgo;

import java.io.FileInputStream;
import java.util.*;

public class p100_maze_by_bfs {

	static int Answer;
	static int h, w;
	private static char[][] map;
	
	public static void main(String args[]) throws Exception {
		
		String path = p100_maze_by_bfs.class.getResource("").getPath();
		String fileName = "p100_maze.txt";
		System.setIn(new FileInputStream(path + fileName));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int testCase = 1; testCase <= T; testCase++) {
			
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
			
			Queue<int[]> q = new LinkedList<int[]>();
			q.add(new int[]{1, 2, 0});
			
			while(true) {
				int[] arr = q.remove();
				
				int row = arr[0];
				int col = arr[1];
				int count = arr[2];
				
				if(map[arr[0]][arr[1]] == 'G') {
					//System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
					Answer = count;
					break;
				}
				map[row][col] = 'x';
				
				if(map[row-1][col] == '.' || map[row-1][col] == 'G') {
					q.add(new int[]{row-1, col, count+1});
				}
				if(map[row+1][col] == '.' || map[row+1][col] == 'G') {
					q.add(new int[]{row+1, col, count+1});
				}
				if(map[row][col-1] == '.' || map[row][col-1] == 'G') {
					q.add(new int[]{row, col-1, count+1});
				}
				if(map[row][col+1] == '.' || map[row][col+1] == 'G') {
					q.add(new int[]{row, col+1, count+1});
				}
			}
			
			System.out.println("#" + testCase + " " + Answer);
		}
	}
	
	
}