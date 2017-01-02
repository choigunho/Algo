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
				
				if(map[arr[0]][arr[1]] == 'G') {
					//System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
					Answer = arr[2];
					break;
				}
				map[arr[0]][arr[1]] = 'x';
				
				if(map[arr[0]-1][arr[1]] == '.' || map[arr[0]-1][arr[1]] == 'G') {
					q.add(new int[]{arr[0]-1, arr[1], arr[2]+1});
				}
				if(map[arr[0]+1][arr[1]] == '.' || map[arr[0]+1][arr[1]] == 'G') {
					q.add(new int[]{arr[0]+1, arr[1], arr[2]+1});
				}
				if(map[arr[0]][arr[1]-1] == '.' || map[arr[0]][arr[1]-1] == 'G') {
					q.add(new int[]{arr[0], arr[1]-1, arr[2]+1});
				}
				if(map[arr[0]][arr[1]+1] == '.' || map[arr[0]][arr[1]+1] == 'G') {
					q.add(new int[]{arr[0], arr[1]+1, arr[2]+1});
				}
			}
			
			System.out.println("#" + testCase + " " + Answer);
		}
	}
	
	
}