package algorithm_md;

import java.io.FileInputStream;
import java.util.*;

public class p140_remote_control {

	static int Answer;
	private static int currentTemp, targetTemp;
	private static int[] temp;
	
	public static void main(String args[]) throws Exception {
		
		String path = p140_remote_control.class.getResource("").getPath();
		String fileName = "p140.txt";
		System.setIn(new FileInputStream(path + fileName));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int testCase = 1; testCase <= T; testCase++) {
			
			currentTemp = sc.nextInt();
			targetTemp = sc.nextInt();
			
			Queue<int[]> q = new LinkedList<>();
			q.add(new int[]{currentTemp, 0});
			
			while(!q.isEmpty()) {
				
				temp = q.remove();
				System.out.println(temp[0] + " " + temp[1]);
				
				if(temp[0] == targetTemp) {
					Answer = temp[1];
					break;
				}
				
				if(targetTemp > temp[0]) {
					q.add(new int[]{temp[0]+1, temp[1]+1}); q.add(new int[]{temp[0]+5, temp[1]+1}); q.add(new int[]{temp[0]+10, temp[1]+1});					
				} else {
					q.add(new int[]{temp[0]-1, temp[1]+1}); q.add(new int[]{temp[0]-5, temp[1]+1}); q.add(new int[]{temp[0]-10, temp[1]+1});
					
				}
				
			}
			
			System.out.println("#" + testCase + " " + Answer);
		}
	}

}