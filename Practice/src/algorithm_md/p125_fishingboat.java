package algorithm_md;

import java.io.FileInputStream;
import java.util.*;

public class p125_fishingboat {

	static int Answer;
	static int W, H;
	static int[][] pond; 
	
	public static void main(String args[]) throws Exception {
		
		String path = p125_fishingboat.class.getResource("").getPath();
		String fileName = "p125.txt";
		System.setIn(new FileInputStream(path + fileName));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int testCase = 1; testCase <= T; testCase++) {
			
			int N = sc.nextInt(); // 연못 높이
			int M = sc.nextInt(); // 연못 폭
			
			H = sc.nextInt(); //그물 높이
			W = sc.nextInt(); //그물 폭
			
			pond = new int[N][M];
			
			// 연못 설정
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					pond[i][j] = sc.nextInt();
				}
			}

			/*
			 * 그물을 던질 수 있는 연못 좌표를 알아낸 후,
			 * 좌표를 기준으로 그물 크기만큼의 물고기를 잡는다.   
			 */
			int Answer = 0;
			for(int i=0; i<N-H+1; i++) { 
				for(int j=0; j<M-W+1; j++) {
					//System.out.println(i + " " + j);
					if(Answer < q(i, j)) {
						Answer = q(i, j); // i, j 좌표에서 H*W 크기의 그물을 던진다. 
					}
				}
			}
			
			System.out.println("#" + testCase + " " + Answer);
		}
	}

	private static int q(int h, int w) {
		
		int sum = 0;
		for(int i=h; i<h+H; i++) {
			for(int j=w; j<w+W; j++) {
				//System.out.println("ij: " + i + " " + j);
				sum += pond[i][j];
			}
		}
		
		//System.out.println("sum: " + sum);
		return sum;
	}

}