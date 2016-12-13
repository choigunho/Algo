package study;

public class p53 {
	
	static int[] input = {1, 2, 3, 5, 7, 9, 11, 15}; //8
	int find = 4;
	
	public static void main(String[] args) {
		
		int start = 0;
		int end = input.length; //8
		
		p53 p = new p53();
		System.out.println(p.solve(start, end));
	}
	
	public int solve(int start, int end) {
		
		while(end-start >= 0) {
			int middleValue = (end + start)/2;
			
			if(input[middleValue] == find) {
				return middleValue + 1;
			} 
			if(input[middleValue] < find) {
				start = middleValue+1;
			} else {
				end = middleValue-1;
			}
		}
		return -1;
	}

}
