package CreativeAlgo;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;

public class p121_fishingboat {

	static int Answer;

	public static void main(String args[]) throws Exception {
		
//		System.setIn(new FileInputStream("C:\\vaccine.txt"));
		System.setIn(new FileInputStream(new File("").getAbsolutePath() + "\\res\\fishingboat.txt"));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int testCase = 0; testCase < T; testCase++) {
			
			int pondSize = sc.nextInt(); // 6
			int fishingNet = sc.nextInt(); // 3
			
			int[] pond = new int[pondSize];
			for(int i=0; i<pondSize; i++) {
				pond[i] = sc.nextInt();
			}
			
			int caughtFish = 0;
			for(int i=0; i<=pondSize-fishingNet; i++) { // 6-3
				
				int total = 0;
				for(int j=0; j<fishingNet; j++) {		
					total += pond[i+j];
				}
				
				if(caughtFish < total) {
					caughtFish = total;
				}
			}
			
			System.out.println("#" + testCase + " " + caughtFish);
		}
		
	}

}