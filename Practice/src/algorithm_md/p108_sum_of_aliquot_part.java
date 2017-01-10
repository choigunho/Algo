package algorithm_md;

import java.io.FileInputStream;
import java.util.*;

public class p108_sum_of_aliquot_part {

	static int Answer;
	
	public static void main(String args[]) throws Exception {
		
		String path = p108_sum_of_aliquot_part.class.getResource("").getPath();
		String fileName = "p108.txt";
		System.setIn(new FileInputStream(path + fileName));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int testCase = 1; testCase <= T; testCase++) {
			
			
			
			System.out.println("#" + testCase + " " + Answer);
		}
	}
	
	
}