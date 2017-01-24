package pastExam;

import java.io.FileInputStream;
import java.util.*;

public class number_array_20170121 {

	private static int Answer;
	private static int depth;
	private static int N;
	private static int[] isVisit;

	public static void main(String args[]) throws Exception {
		
		String path = number_array_20170121.class.getResource("").getPath();
		String fileName = "number_array_20170121.txt";
		System.setIn(new FileInputStream(path + fileName));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int testCase = 1; testCase <= T; testCase++) {
			
			N = sc.nextInt();
			isVisit = new int[N+1];
			
			depth = 0;
			Answer = 0;
			
			dfs(0);
			
			System.out.println("#" + testCase + " " + Answer);
		}
	}

	private static void dfs(int currentNum) {
		
		//System.out.println(currentNum + " " + depth);
		isVisit[currentNum] = 1;
		
		if(depth == N) {
			Answer++;
			return;
		}
		
		for(int i=1; i<=N; i++) {

			if(isVisit[i] == 0) {
				depth++;
				if(i == depth || i == depth-1 || i == depth+1) {
					dfs(i);
					isVisit[i] = 0;
				}
				depth--;
			}
			
		}
	}
}