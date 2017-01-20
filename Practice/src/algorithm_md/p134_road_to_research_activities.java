package algorithm_md;

import java.io.FileInputStream;
import java.util.*;

public class p134_road_to_research_activities {

	static int Answer;
	static int[][] map;
	static int[] isVisited;
	static int node, net;
	
	public static void main(String args[]) throws Exception {
		
		String path = p134_road_to_research_activities.class.getResource("").getPath();
		String fileName = "p134.txt";
		System.setIn(new FileInputStream(path + fileName));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int testCase = 1; testCase <= T; testCase++) {
			
			node = sc.nextInt();
			net = sc.nextInt();
			map = new int[node+1][node+1];
			
			// map 설정
			for(int i=0; i<net; i++) {
				int from = sc.nextInt();
				int to = sc.nextInt();
				
				map[from][to] = map[to][from] = sc.nextInt();
			}
			
			isVisited = new int[node+1];
			
			dfs(1, 0);
			
			System.out.println("#" + testCase + " " + Answer);
		}
	}

	private static void dfs(int currentNode, int cost) {
		
		isVisited[currentNode] = 1;
		System.out.println(currentNode);
		
		if(currentNode == node) {
			return;
		}
		
		
		for(int i=1; i<=node; i++) {
			if(map[currentNode][i] != 0 && isVisited[i] == 0) {
				
				dfs(i, 0);
			}
		}
		
		
	}

}