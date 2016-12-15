package CreativeAlgo;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;

public class p85_nqeen {

	static int Answer;
	static int queen;
	
	public static void main(String args[]) throws Exception {
		
		String path = new File("").getAbsoluteFile() + "\\res\\";
		String fileName = "p85_nqeen.txt";
		System.setIn(new FileInputStream(path + fileName));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int testCase = 0; testCase < T; testCase++) {
			
			queen = sc.nextInt();
			
			
			
			System.out.println("#" + testCase + " " + Answer);
		}
		
	}
	
	
}