package algorithm_md;

import java.io.FileInputStream;
import java.util.*;

public class p140_remote_control {

	static int Answer;
	
	public static void main(String args[]) throws Exception {
		
		String path = p140_remote_control.class.getResource("").getPath();
		String fileName = "p140.txt";
		System.setIn(new FileInputStream(path + fileName));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int testCase = 1; testCase <= T; testCase++) {
			
			
			
			
			
			
			
			
			System.out.println("#" + testCase + " " + Answer);
		}
	}

}