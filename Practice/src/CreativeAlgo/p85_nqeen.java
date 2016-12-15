package CreativeAlgo;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;

public class p85_nqeen {

	static int Answer;
	static int queen;
	static int[] checkCol;
	static int[] checkDesc;
	static int[] checkAsc;
	
	public static void main(String args[]) throws Exception {
		
		String path = new File("").getAbsoluteFile() + "\\res\\";
		String fileName = "p85_nqeen.txt";
		System.setIn(new FileInputStream(path + fileName));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int testCase = 0; testCase < T; testCase++) {
			
			queen = sc.nextInt();

			checkCol = new int[queen];
			checkDesc = new int[8];
			checkAsc = new int[8];
			
			System.out.println(dfs(1, 1));
			
			System.out.println("#" + testCase + " " + Answer);
		}
	}
	
	public static int dfs(int row, int col) {
		
		// 
		
		// col 체크, 1이면 백트레킹
		if(checkCol[row] == 0) {
			checkCol[row-1] = 1;
		}
		
		// \ 체크, 1이면 백트레킹
		if(checkDesc[queen-(row-col)] == 0) { // 4-(1-1)
			checkDesc[queen-(row-col)-1] = 1;
		}
		
		// / 체크, 1이면 백트레킹
		if(checkAsc[row + col] == 0) {
			checkAsc[row + col -1] = 1;
		}
		
		
		// 다음 row에서 탐색
		
		
		
		return 1;
	}
}