package algorithm_md;

import java.io.FileInputStream;
import java.util.*;

public class p96_mole_tunnel {

	static int Answer;
	static int[][] map;
	static List<Integer> l;
	private static int count;
	
	public static void main(String args[]) throws Exception {
		
		String path = p96_mole_tunnel.class.getResource("").getPath();
		String fileName = "p96_mole_tunnel.txt";
		System.setIn(new FileInputStream(path + fileName));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int testCase = 0; testCase < T; testCase++) {
			
			int area = sc.nextInt();
			map = new int[area+2][area+2];
			
			for(int i=1; i<=area; i++) {
				for(int j=1; j<=area; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			l = new ArrayList<Integer>();
			for(int i=1; i<= area; i++) {
				for(int j=1; j<= area; j++) {
					if(map[i][j] == 1) {
						dfs(i, j);
//						System.out.println("count: " + count);
						
						l.add(count);
						
						count = 0;
					}
				}
			}
			
			l.sort(null);
			Answer = l.size();
			System.out.println("#" + testCase + " " + Answer + " " + l);
		}
	}
	
	public static void dfs(int r, int c) {
		
		if(map[r][c] == 1) {
//			System.out.println(r + " " + c);
			count++;
			map[r][c] = 0;
			
			if(map[r+1][c] == 1 || map[r-1][c] == 1 || map[r][c+1] == 1 || map[r][c-1] == 1) {
				dfs(r+1, c);
				dfs(r-1, c);
				dfs(r, c+1);
				dfs(r, c-1);
			}
			
		}
		
	}
	
}