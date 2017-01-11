package algorithm_md;

import java.io.FileInputStream;
import java.util.*;

public class p000_template {

	static int Answer;
	
	public static void main(String args[]) throws Exception {
		
		String path = p000_template.class.getResource("").getPath();
		String fileName = "p000.txt";
		System.setIn(new FileInputStream(path + fileName));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int testCase = 1; testCase <= T; testCase++) {
			
			
			
			
			
			System.out.println("#" + testCase + " " + Answer);
		}
	}

}