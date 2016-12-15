package CreativeAlgo;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;

public class p85_nqeen {

	static int Answer;
	static int queen;
	static int[] checkRow;
	static int[] checkDesc;
	static int[] checkAsc;
	private static int count;
	
	public static void main(String args[]) throws Exception {
		
		String path = new File("").getAbsoluteFile() + "\\res\\";
		String fileName = "p85_nqeen.txt";
		System.setIn(new FileInputStream(path + fileName));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int testCase = 0; testCase < T; testCase++) {
			
			queen = sc.nextInt();

			checkRow = new int[queen+1];
			checkDesc = new int[8];
			checkAsc = new int[8];
			
			System.out.println(dfs(1, 1));
			
			System.out.println("#" + testCase + " " + Answer);
		}
	}
	
	public static int dfs(int row, int col) {
//		System.out.println(row);
		count += 1;

		if(count == 4) {
			System.out.println("ok");
		}
		
		
		if(row < queen) {
			row += 1;

			dfs(row, 1);
		}
		
		/*
		if(checkRow[row] == 0 && checkDesc[queen-(row-col)] == 0 && checkAsc[row+col] == 0) {
			count += 1;
			
			checkRow[row-1] = 1; 		       // col 체크, 1이면 백트레킹
			checkDesc[queen-(row-col)-1] = 1;  // \ 체크, 1이면 백트레킹
			checkAsc[row+col-1] = 1;		   // / 체크, 1이면 백트레킹
		}
		
		if(row < queen) {
			row += 1;

			dfs(row, 1);
		}
		*/

		/*
		if(checkDesc[queen-(row-col)] == 0) { // 4-(1-1)
			checkDesc[queen-(row-col)-1] = 1;
		}

		if(checkAsc[row+col] == 0) {
			checkAsc[row+col-1] = 1;
		}
		*/
		
		
		return 0;
	}
}