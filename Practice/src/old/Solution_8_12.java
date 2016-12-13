package old;
import java.util.ArrayList;
import java.util.Collections;

class Solution_8_12
{
    public static void main(String args[]) throws Exception
    {
    	double a = 2;
    	double b = 3;
    	
    	ArrayList<Double> li = new ArrayList<Double>();

    	// a와 b의 조합으로 나오는 값 리스트
    	for(int i=0; i<100; i++) {
    		for(int j=0; j<100; j++) {
    			li.add(Math.pow(a, i) * Math.pow(b, j));
    			
    		}
    	}
    	li.remove(0);
    	Collections.sort(li);
    	
    	System.out.println(li); // [4.0, 6.0, 8.0, 9.0, 12.0, 16.0, 18.0, 24.0, 27.0, 32.0, 36.0, 48.0, 54.0, 64.0
    	System.out.println(li.get(9)); // 32.0
    }
       
}
