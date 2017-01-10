package algorithm_md;

public class step2 {

	static boolean[] isVisit;
	static int[][] ad;
	static int endPoint;
	static int node;
	static int minCost;
	
	public static int dfs(int current, int cost) {
		if(current == endPoint) {
			System.out.println("end point reached \n");
			
			if(cost < minCost) {
				minCost = cost;
			}
			return 0;
		}
		
		isVisit[current] = true;
		
		for(int i=1; i<node; i++) {
			cost += ad[current][i];
			if(ad[current][i] != 0 && !isVisit[i]) {
				System.out.print(current + " -> " + i + " ");
				System.out.println("(cost: " + cost + ")");
				
				dfs(i, cost);
				//System.out.println("current: " + current + " cost: " + cost);
				
				// back track시 지나온 경로와 누적 비용도 함께 roll back~
				isVisit[current] = false;
				cost -= ad[current][i];
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
	
		endPoint = 7;
		node = 11;
		
		isVisit = new boolean[endPoint + 1];
		ad = new int[endPoint+1][node];
		
		minCost = 999;
		
		ad[1][2] = 47;
		ad[1][3] = 69;
		ad[2][4] = 57;
		ad[2][5] = 124;
		ad[3][4] = 37;
		ad[3][5] = 59;
		ad[3][6] = 86;
		ad[4][6] = 27;
		ad[4][7] = 94;
		ad[5][7] = 21;
		ad[6][7] = 40;
		
		dfs(1, 0);
		
		System.out.println("minCost: " + minCost);
	}
}