package study;

public class Q3 {
	
	static int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //10
	
	public static void main(String[] args) {

		int find = 10;
		int start = 0;
		int end = input.length;
		
		while(end-start >= 0) {
			int middleValue = (end + start)/2;
			
			if(input[middleValue] == find) {
				System.out.println(middleValue + 1);
				break;
			} 
			if(input[middleValue] < find) {
				start = middleValue+1;
			} else {
				end = middleValue-1;
			}
		}
		
	}

}
