package study;

public class step3 {

	static boolean[] isVisit;
	static int[][] ad;
	static int lastNode;
	static int minCost;
	
	public static int dfs(int current, int cost) {
		if(current == lastNode) {
			System.out.println("end point reached \n");
			
			if(cost < minCost) {
				minCost = cost;
			}
			return 0;
		}
		
		isVisit[current] = true;
		
		for(int target=2; target<=lastNode; target++) {
			if(ad[current][target] != 0 && !isVisit[target]) {
				cost += ad[current][target];
				System.out.println(current + " -> " + target + " (cost: " + cost + ")");
				
				dfs(target, cost);
				//System.out.println("current: " + current);
				
				cost -= ad[current][target];
			}
		}
		isVisit[current] = false;
		return 0;
	}
	
	public static void main(String[] args) {
	
		lastNode = 7;
		
		isVisit = new boolean[lastNode+1];
		ad = new int[lastNode+1][lastNode+1];
		
		minCost = 999;
		
		ad[1][2] = ad[2][1] = 47;
		ad[1][3] = ad[3][1] = 69;
		ad[2][4] = ad[4][2] = 57;
		ad[2][5] = ad[5][2] = 124;
		ad[3][4] = ad[4][3] = 37;
		ad[3][5] = ad[5][3] = 59;
		ad[3][6] = ad[6][3] = 86;
		ad[4][6] = ad[6][4] = 27;
		ad[4][7] = ad[7][4] = 94;
		ad[5][7] = ad[7][5] = 21;
		ad[6][7] = ad[7][6] = 40;
		
		dfs(1, 0);
		
		System.out.println("minCost: " + minCost);
	}
}