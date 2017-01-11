package algorithm_ad;


// eclipse
public class p7 {
	
	public static void main(String args[]) {
		
		long start_time = System.nanoTime();
		System.out.println(f1(10 * 1000));
		long end_time = System.nanoTime();
		System.out.println("경과 시간: " + (end_time - start_time)/1000000.0 + " 밀리세컨드");
		
		start_time = System.nanoTime();
		System.out.println(f2(10 * 1000));
		end_time = System.nanoTime();
		System.out.println("경과 시간: " + (end_time - start_time)/1000000.0 + " 밀리세컨드");
		
		start_time = System.nanoTime();
		System.out.println(f3(10 * 1000));
		end_time = System.nanoTime();
		System.out.println("경과 시간: " + (end_time - start_time)/1000000.0 + " 밀리세컨드");
		
	}
	
	public static int f1(int n) {

		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static int f2(int n) {
		
		if(n == 1) {
			return 1;
		}
		return f2(n-1)+n;
	}
	
	public static int f3(int n) {
		if(n == 1) return 1;
		return 2*f3(n/2) + ((n+1)/2)*((n+1)/2);
	}
	
}
