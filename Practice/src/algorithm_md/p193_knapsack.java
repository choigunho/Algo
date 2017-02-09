package algorithm_md;

import java.io.FileInputStream;
import java.util.*;

public class p193_knapsack {

	static int Answer;
	private static int totalStuff;
	private static int maxWeight;
	private static int count;
	private static int[] isVisit;
	private static int[] weight;
	private static int[] value;
	private static int accWeight;
	private static int accValue;
	
	public static void main(String args[]) throws Exception {
		
		String path = p193_knapsack.class.getResource("").getPath();
		String fileName = "p193.txt";
		System.setIn(new FileInputStream(path + fileName));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int testCase = 1; testCase <= T; testCase++) {
			
			totalStuff = sc.nextInt();
			maxWeight = sc.nextInt();
			
			weight = new int[totalStuff+1];
			value = new int[totalStuff+1];
			
			// 물건 무게와 가격을 배열에 저장
			for(int i=1; i<=totalStuff; i++) {
				weight[i] = sc.nextInt();
				value[i] = sc.nextInt();
			}
			
			isVisit = new int[totalStuff + 1];
			accWeight = weight[1];
			accValue = value[1];
			Answer = -1;
			dfs(1);
			
			System.out.println("#" + testCase + " " + Answer);
		}
	}

	private static void dfs(int itemNum) {
		
		isVisit[itemNum] = 1;
		System.out.printf("무게:%s 가격:%s 누적 무게:%s 누적 가격:%s\n", weight[itemNum], value[itemNum], accWeight, accValue);
		
		if(accWeight <= maxWeight) {
			System.out.println("ok");
			if(Answer < accValue) {
				Answer = accValue;
			};
		} else {
			System.out.println("fail!!!");
			return;
		}
		
		for(int i=1; i<=totalStuff; i++) {
			if(isVisit[i] == 0) {
				count++;
				accWeight+=weight[i];
				accValue+=value[i];
				dfs(i);
				count--;
				accWeight-=weight[i];
				accValue-=value[i];
				isVisit[i] = 0;
			}
		}
		
	}

}