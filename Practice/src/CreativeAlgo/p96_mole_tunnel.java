package CreativeAlgo;

import java.io.FileInputStream;
import java.util.*;

public class p96_mole_tunnel {

	static int Answer;
	static int[][] map;
	
	
	public static void main(String args[]) throws Exception {
		
		String path = p96_mole_tunnel.class.getResource("").getPath();
		String fileName = "p96_mole_tunnel.txt";
		System.setIn(new FileInputStream(path + "\\" + fileName));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int testCase = 0; testCase < T; testCase++) {
			
			
			
			
			
			
			System.out.println("#" + testCase + " " + Answer);
		}
	}
	
	public static void dfs(int row) {
		
	}
	
}