package study;

import java.io.FileInputStream;
import java.util.*;

public class vaccine2 {

	static int Answer;
	static int totalPerson;
	static int Network;

	static List<Integer> allmeet = new ArrayList<>();
	static Queue<int[]> q = new LinkedList<int[]>();
	static int map[][];
	static int result;
	
	public static void main(String args[]) throws Exception {
		
		System.setIn(new FileInputStream("C:\\vaccine.txt"));	
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int testCase = 0; testCase < T; testCase++) {
			
			totalPerson = sc.nextInt();
			Network = sc.nextInt();
			
			// *****************************************************************
			
			// create map
			map = new int[totalPerson+1][totalPerson+1];
			
			for(int i=0; i<Network; i++) {
				int row = sc.nextInt();
				int col = sc.nextInt();
				map[row][col] = map[col][row] = 1;
			}
			
			result = 999;
			
			for(int i=1; i<=totalPerson; i++) {
				int current = i;
				int count = 2;
				q.add(new int[]{current, count});
				allmeet.add(current);
				
				System.out.println("=============");
				int tmp = queue(current, count);
				System.out.println("result: " + tmp);
				
				if(result > tmp) {
					result = tmp;
				}
				allmeet.clear();
			}
			
			// *****************************************************************
			System.out.println("#" + testCase + " " + result);
		}
		
	}

	public static int queue(int startPerson, int count) {
		
		while(true) {
			
			int[] arr = q.remove();
			
			if(allmeet.size() == totalPerson) {
				q.clear();
				return arr[1];
			}

			// 다음에 만날 사람들을 큐에 넣는다.			
			for(int i=1; i<totalPerson+1; i++) {
				
				if(map[arr[0]][i] == 1 && !allmeet.contains(i)) {
					System.out.println("current: " + arr[0] + ", network: " + i + ", count: " + arr[1]);
					
					allmeet.add(i);
					q.add(new int[]{i, arr[1] + 1});
				}
			}
		}
	}

}