package algorithm_md;

import java.io.FileInputStream;
import java.util.*;

public class p96_mole_tunnel {

	static int Answer;
	private static int[][] map;
	
	public static void main(String args[]) throws Exception {
		
		String path = p96_mole_tunnel.class.getResource("").getPath();
		String fileName = "p77.txt";
		System.setIn(new FileInputStream(path + fileName));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int testCase = 1; testCase <= T; testCase++) {
			
			int area = sc.nextInt();
			map = new int[area+2][area+2];
			
			for(int i=1; i<=area; i++) {
				for(int j=1; j<=area; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			for(int i=1; i<=area; i++) {
				for(int j=1; j<=area; j++) {
					if(map[i][j]==1) {
						bfs(i, j);
					}
				}
			}
			
			System.out.println("#" + testCase + " " + Answer);
		}
	}

	private static int bfs(int i, int j) {
		
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[]{i, j});
		
		int count = 0;
		while(true) {
			
			if(q.isEmpty()) {
				System.out.println("break " + count);
				return count;
			}
			
			int[] tmp = q.remove();
			
			if(map[tmp[0]+1][j]==1) {
				q.add(new int[]{i+1, j});
				map[i+1][j] = 0; count++;
			}
			if(map[i-1][j]==1) {
				q.add(new int[]{i-1, j});
				map[i-1][j] = 0; count++;
			}
			if(map[i][j+1]==1) {
				q.add(new int[]{i, j+1});
				map[i][j+1] = 0; count++;
			}
			if(map[i][j-1]==1) {
				q.add(new int[]{i, j-1});
				map[i][j-1] = 0; count++;
			}
		}
		
	}

}