package algorithm_md;

import java.io.FileInputStream;
import java.util.*;

public class p121_fishingboat {

	static int Answer;

	public static void main(String args[]) throws Exception {
		
		String path = p121_fishingboat.class.getResource("").getPath();
		String fileName = "p121.txt";
		System.setIn(new FileInputStream(path + fileName));
		
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int testCase = 0; testCase < T; testCase++) {
			
			int pondSize = sc.nextInt(); // 6
			int fishingNet = sc.nextInt(); // 3
			
			// 연못 셋팅
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