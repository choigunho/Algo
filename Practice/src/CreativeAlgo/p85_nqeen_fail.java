package CreativeAlgo;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;

public class p85_nqeen_fail {

	static int Answer;
	static int[][] map;
	static int count;
	static int queen;
	static int total, result; 
	
	public static void main(String args[]) throws Exception {
		
		String path = new File("").getAbsoluteFile() + "\\res\\";
		String fileName = "p85_nqeen.txt";
		System.setIn(new FileInputStream(path + fileName));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int testCase = 0; testCase < T; testCase++) {
			
			queen = sc.nextInt();
			
			map = new int[queen][queen];
			
//			for(int i=0; i<queen; i++) {
//				result = dfs(0, i);
//			}

//			dfs(0,0);
//			dfs(0,1);
			System.out.println(dfs(0,2));
//			dfs(0,3);
			
			System.out.println("#" + testCase + " " + Answer);
		}
		
	}
	
	public static int dfs(int row, int col) {
		
		if(map[row][col] == 0) {
			
			count += 1;
			if(count == queen) {
				System.out.println("ok");
				return 1;
			}

			// 같은 row 1로 마킹하기
			int tmpRow = row; int tmpCol = 0;
			for(int j=0; j<queen; j++) {
				if(tmpCol+1 < queen) {
					map[tmpRow][j] = 1;
				}
			}
			
			// 같은 col 1로 마킹하기
			tmpRow = 0; tmpCol = col;
			for(int j=0; j<queen; j++) {
				if(tmpRow+1 != queen) {
					map[j][tmpCol] = 1;
				}
			}
			
			// 기울기 감소 대각선 위치 1로 마킹하기
			tmpRow = row; tmpCol = col;
			for(int j=row; j<queen; j++) {                
				if(tmpRow+1 != queen && tmpCol+1 != queen) {
					tmpRow += 1; tmpCol += 1;
					map[tmpRow][tmpCol] = 1;
				}
			}
			
			// 기울기 상승 대각선 위치 1로 마킹하기
			tmpRow = row; tmpCol = col;
			for(int j=row; j<queen; j++) {
				if(tmpRow+1 != queen && tmpCol-1 >= 0) {
					tmpRow += 1; tmpCol -= 1;
					map[tmpRow][tmpCol] = 1;
				}
			}
			
			//
			if(row+1 < queen) {
				row += 1;
				dfs(row, 0);
			}
		} else {
			if(col+1 < queen) {
				col += 1;
				dfs(row, col);
			}
		}
		return 0;
		
	}

}