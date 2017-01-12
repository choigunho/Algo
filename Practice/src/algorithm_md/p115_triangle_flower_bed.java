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
			
			
			
			
			
			
			/*
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
			*/
			
			System.out.println("#" + testCase + " " + Answer);
		}
	}

}