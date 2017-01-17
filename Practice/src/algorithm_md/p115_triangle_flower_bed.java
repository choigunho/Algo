package algorithm_md;

import java.io.FileInputStream;
import java.util.*;

public class p115_triangle_flower_bed {

	static int Answer;
	
	public static void main(String args[]) throws Exception {
		
		String path = p115_triangle_flower_bed.class.getResource("").getPath();
		String fileName = "p115.txt";
		System.setIn(new FileInputStream(path + fileName));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int testCase = 1; testCase <= T; testCase++) {
			
			int n = sc.nextInt();
			int Answer = 0;
			
			
			
			// #4
			
			
			
			
			/*
			// #3
			dfs(n, 1, 1, 1);
			*/
			
			/*
			// #2 : 0 ms, 4 ms, 75 ms
			long start_time = System.currentTimeMillis();
			for(int a=1; a<=n; a++) {
				for(int b=a; b<=n; b++) {
					int c = n-a-b;
					
					if((c>=b) && ((a+b)>c)) {
						Answer++;
						//System.out.println(a + " " + b + " " + c);
					}
				}
			}
			long end_time = System.currentTimeMillis();
			System.out.println("경과 시간: " + (end_time - start_time) + " ms");
			*/
			
			/*
			// #1 : 2 ms, 254 ms, 
			long start_time = System.currentTimeMillis();
			for(int a=1; a<=n; a++) {
				for(int b=a; b<=n; b++) {
					for(int c=b; c<=n; c++) {
						
						if((a+b+c)==n && ((a+b)>c)) {
							Answer++;
							//System.out.println(a + " " + b + " " + c);
						}
					}
				}
			}
			long end_time = System.currentTimeMillis();
			System.out.println("경과 시간: " + (end_time - start_time) + " ms");
			*/
			
			System.out.println("#" + testCase + " " + Answer);
		}
	}
	
	public static void dfs(int n, int a, int b, int c) {
		if(a+b+c==n) {
			if(a<=b && b<=c && a+b>c) {
				Answer++;
				return;
			}
			
		}
		dfs(n, a+1, b, c);
		dfs(n, a, b+1, c);
		dfs(n, a, b, c+1);
	}

}