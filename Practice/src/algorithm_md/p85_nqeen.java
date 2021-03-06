package algorithm_md;

import java.io.FileInputStream;
import java.util.*;

public class p85_nqeen {

	static int Answer;
	static int queen;
	static int[] checkCol;
	static int[] checkDesc;
	static int[] checkAsc;
	
	public static void main(String args[]) throws Exception {
		
		String path = p85_nqeen.class.getResource("").getPath();
		String fileName = "p85.txt";
		System.setIn(new FileInputStream(path + fileName));
		
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int testCase = 0; testCase < T; testCase++) {
			
			queen = sc.nextInt();

			checkCol = new int[queen+1];
			checkDesc = new int[queen*queen];
			checkAsc = new int[queen*queen];
			
			dfs(1);
			
			System.out.println("#" + testCase + " " + Answer);
		}
	}
	
	public static void dfs(int row) {

		if(row > queen) {
			Answer++;
			return;
		}

		for(int i=1; i<=queen; i++) {
			if(checkCol[i] == 0 && checkDesc[queen+(row-i)+1] == 0 && checkAsc[row+i] == 0) {
				checkCol[i] = 1; 		       // col 체크, 1이면 백트레킹
				checkDesc[queen+(row-i)+1] = 1;    // \ 체크, 1이면 백트레킹
				checkAsc[row+i] = 1;		       // / 체크, 1이면 백트레킹
				
				dfs(row+1);
				
				checkCol[i] = 0; 		       
				checkDesc[queen+(row-i)+1] = 0;  
				checkAsc[row+i] = 0;		    
			}
		}
		return;
		
	}
}