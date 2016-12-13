package old;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution15
{
    static int Answer;
    
    public static void main(String args[]) throws Exception
    {
        /*
        아래의 메소드 호출은 앞으로 표준 입력(키보드)대시
        파일로부터 읽어오겠다는 의미의 코드입니다.
        단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나
        주석 처리해야 합니다.
        */
        System.setIn(new FileInputStream("C:\\sample_input15.txt"));
        
        Scanner sc = new Scanner(System.in);
        int T, n, i, j, k, l; 
        T = sc.nextInt();
        
        for (int test_case = 1 ; test_case <= T; test_case++)
        {
        	n = sc.nextInt();
        	int[] numbers = new int[(n*n+n)/2];
        	for(i=0; i<(n*(n+1)/2); i++) {
        		numbers[i] = sc.nextInt();
        	}
        	
        	Answer = 0;
            /////////////////////////////////////////////
        	int[] numberStack = new int[2*n - 1];
            
        	for(i=0, l=0; i<n; i++) {
        		for(j=0, k=i; j<n-i; j++, k+=2) {
        			numberStack[k] += numbers[l++];
        		}
        	}        	

        	for(i=0; i<n; i++) {
        		if(numberStack[i] > Answer) {
        			Answer = numberStack[i];
        		}
        	}
            /////////////////////////////////////////////
            
            /* 결과 값 출력 */
            System.out.println("#" + test_case + " " + Answer);
         }
    }
}
