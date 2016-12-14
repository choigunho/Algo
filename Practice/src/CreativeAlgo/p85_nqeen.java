package CreativeAlgo;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;

public class p85_nqeen {

	static int Answer;
	static int[][] map;
	static int count;
	static int queen;

	public static void main(String args[]) throws Exception {
		
		String path = new File("").getAbsoluteFile() + "\\res\\";
		String fileName = "p85_nqeen.txt";
		System.setIn(new FileInputStream(path + fileName));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int testCase = 0; testCase < T; testCase++) {
			
			queen = sc.nextInt();
			
			map = new int[queen][queen];
			
			System.out.println(dfs(0,0));
//			System.out.println(dfs(0,1));
//			System.out.println(dfs(0,2));
//			System.out.println(dfs(0,3));
			
			System.out.println("#" + testCase + " " + Answer);
		}
		
	}
	
	public static boolean dfs(int row, int col) {
		
		if(count == queen) {
			System.out.println("ok");
			return true;
		}
		
		// 퀸을 배치할 수 있는가?
		for(int i=0; i<queen; i++) {
			if(map[row][i] == 0) {
				
				System.out.println("map[row][i]:" + row + " " + i);
				
				map[row][i] = 1;
				count += 1;
				
				int tmpRow = row; int tmpCol = i;
				// 기울기 감소 대각선 위치 1로 마킹하기
				for(int j=row; j<queen; j++) {                   // 1, 2
					if(tmpRow+1 != queen && tmpCol+1 != queen) {
						tmpRow += 1; tmpCol += 1;
						map[tmpRow][tmpCol] = 1;
					}
				}
				
				tmpRow = row; tmpCol = i;
				// 기울기 상승 대각선 위치 1로 마킹하기
				for(int j=row; j<queen; j++) {
					if(tmpRow+1 != queen && tmpCol-1 >= 0) {
						tmpRow += 1; tmpCol -= 1;
						map[tmpRow][tmpCol] = 1;
					}
				}
				
				tmpRow = row; tmpCol = i;
				// 같은 col 1로 마킹하기
				for(int j=row; j<queen; j++) {
					if(tmpRow+1 != queen) {
						tmpRow += 1;
						map[tmpRow][tmpCol] = 1;
					}
				}
				if(row < queen) {
					row += 1;
					dfs(row, 0);
				}
			} else {
				return false;
			}
			
			
		}
		return false;
		
	}

}