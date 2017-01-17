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
			
			
			// 두 번째 풀이 : 2 ms, 128 ms
			long start_time = System.currentTimeMillis();
			for(int a=1; a<=n; a++) {
				for(int b=a; b<=n; b++) {
					int c = n-a-b;
					
					if((c>=b) && ((a+b)>c)) {
						Answer++;
						System.out.println(a + " " + b + " " + c);
					}
				}
			}
			long end_time = System.currentTimeMillis();
			System.out.println("경과 시간: " + (end_time - start_time) + " ms");
			
			/* 
			// 첫 번째 풀이 : 4 ms, 382 ms
			long start_time = System.currentTimeMillis();
			for(int a=1; a<=n; a++) {
				for(int b=a; b<=n; b++) {
					for(int c=b; c<=n; c++) {
						
						if((a+b+c)==n && ((a+b)>c)) {
							Answer++;
							System.out.println(a + " " + b + " " + c);
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

}