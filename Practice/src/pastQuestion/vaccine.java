package pastQuestion;

import java.io.FileInputStream;
import java.util.*;

public class vaccine {

	static int totalPerson;
	static int networkCount;

	static List<Integer> personContainer = new ArrayList<>();
	static Queue<int[]> q = new LinkedList<int[]>();
	static int map[][];
	static int minDepth;
	
	
	public static void main(String args[]) throws Exception {
		
		System.setIn(new FileInputStream("C:\\vaccine.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int testCase = 0; testCase < T; testCase++) {
			
			totalPerson = sc.nextInt();
			networkCount = sc.nextInt();
			
			// create map
			map = new int[totalPerson+1][totalPerson+1];
			
			for(int i=0; i<networkCount; i++) {
				int row = sc.nextInt();
				int col = sc.nextInt();
				map[row][col] = map[col][row] = 1;
			}
			
			minDepth = 999;
			
			for(int i=1; i<=totalPerson; i++) {
				int currentPerson = i;
				int startDepth = 1;
				
				q.add(new int[]{currentPerson, startDepth});
				personContainer.add(currentPerson);
				
				System.out.println("=============");
				int tmpDepth = queue(currentPerson);
				System.out.println("minDepth: " + tmpDepth);
				
				if(minDepth > tmpDepth) {
					minDepth = tmpDepth;
				}
				personContainer.clear();
			}
			
			System.out.println("#" + testCase + " " + minDepth);
		}
		
	}

	public static int queue(int startPerson) {
		
		while(true) {
			
			int[] arr = q.remove();
			
			if(personContainer.size() == totalPerson) {
				q.clear();
				return arr[1] + 1;
			}

			// ?ó∞Í≤∞Îêú ?Ç¨?ûå?ì§?ùÑ ?Åê?óê ?Ñ£?äî?ã§.			
			for(int i=1; i<totalPerson+1; i++) {
				
				if(map[arr[0]][i] == 1 && !personContainer.contains(i)) {
					System.out.println("current: " + arr[0] + ", connected: " + i + ", depth: " + arr[1]);
					
					personContainer.add(i);
					q.add(new int[]{i, arr[1] + 1});
				}
			}
		}
	}

}