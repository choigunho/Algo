package study;

public class step1 {

	static boolean[] isVisit;
	static int[][] ad;
	static int visitPoint;
	static int endPoint;
	static int node;
	
	public static int dfs(int current) {
		if(current == endPoint) {
			System.out.println("end point reached \n");
			return 0;
		}
		
		isVisit[current] = true;
		
		for(int i=1; i<node; i++) {
			if(ad[current][i] == 1 && !isVisit[i]) {
				System.out.println(current + " -> " + i);
				dfs(i);
				//System.out.println("current: " + current);
				isVisit[current] = false;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
	
		endPoint = 7;
		node = 11;
		
		isVisit = new boolean[endPoint + 1];
		ad = new int[20][20];
		
		// 일단 배열값은 1로.
		ad[1][2] = 1;
		ad[1][3] = 1;
		ad[2][4] = 1;
		ad[2][5] = 1;
		ad[3][4] = 1;
		ad[3][5] = 1;
		ad[3][6] = 1;
		ad[4][6] = 1;
		ad[4][7] = 1;
		ad[5][7] = 1;
		ad[6][7] = 1;
		
		dfs(1);
	}
}