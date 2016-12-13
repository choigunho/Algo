package study;

import java.util.LinkedList;
import java.util.Queue;

public class dfs_q1_step1 {

	static int targetTemp, currentTemp;
	static int count;
	
	public static void main(String[] args) {
	
		targetTemp = 34;
		currentTemp = 7;
		count = 0;

		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[]{count, currentTemp});
		
		while(true) {
			
			int[] arr = q.remove();
			if(arr[1] == targetTemp) {
				System.out.println(arr[0] + " " + arr[1]);
				break;
			}
			
			q.add(new int[]{arr[0] + 1, arr[1] + 10}); 
			q.add(new int[]{arr[0] + 1, arr[1] + 5}); 
			q.add(new int[]{arr[0] + 1, arr[1] + 1}); 
			q.add(new int[]{arr[0] + 1, arr[1] - 10}); 
			q.add(new int[]{arr[0] + 1, arr[1] - 5}); 
			q.add(new int[]{arr[0] + 1, arr[1] - 1}); 
			
		}
		
	}
}