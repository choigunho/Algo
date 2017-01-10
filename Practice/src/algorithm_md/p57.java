package algorithm_md;

public class p57 {
	
	static int[] input = {1, 2, 3, 5, 7, 9, 11, 15}; //8
	int find = 6;
	private int middleValue;
	
	public static void main(String[] args) {
		
		int start = 0;
		int end = input.length + 1; //8
		
		p57 p = new p57();
		System.out.println(p.solve(start, end));
	}
	
	public int solve(int start, int end) {
		
		while(end-start >= 0) {
			middleValue = (end + start)/2;
			
			if(input[middleValue] == find) {
				return middleValue + 1;
			} 
			if(input[middleValue] < find) {
				start = middleValue+1;
			} else {
				end = middleValue;
			}
		}
		return input[middleValue];
	}

}
