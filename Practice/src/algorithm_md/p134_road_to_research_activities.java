package algorithm_md;

import java.io.FileInputStream;
import java.util.*;

public class p134_road_to_research_activities {

	static int Answer;
	static int[][] map;
	static int[] isVisit;
	static int node, net, cost;
	
	public static void main(String args[]) throws Exception {
		
		String path = p134_road_to_research_activities.class.getResource("").getPath();
		String fileName = "p134.txt";
		System.setIn(new FileInputStream(path + fileName));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		long start_time = System.currentTimeMillis();
		
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
			
			isVisit = new int[node+1];
			Answer = Integer.MAX_VALUE;
			
			dfs(1, 0);
			
			System.out.println("#" + testCase + " " + Answer);
		}
		
		long end_time = System.currentTimeMillis();
		System.out.println("경과 시간: " + (end_time - start_time) + " ms");
	}

	private static void dfs(int currentNode, int totalCost) {
		
		isVisit[currentNode] = 1;
		//System.out.printf("%d %d\n", currentNode, totalCost);
		
		if(currentNode == node) {
			
			if(cost < Answer) {
				Answer = cost;
			}
			
			return;
		}
		
		for(int i=1; i<=node; i++) {
			if(map[currentNode][i] != 0 && isVisit[i] == 0 && totalCost < Answer) {
				cost += map[currentNode][i];
				dfs(i, cost);
				isVisit[i] = 0;
				cost -= map[currentNode][i];
			}
		}
	}
}