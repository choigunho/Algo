import java.util.Scanner;
import java.io.FileInputStream;

class Solution11
{
    static int L, Answer;
    
    public static void main(String args[]) throws Exception
    {
        /*
        아래의 메소드 호출은 앞으로 표준 입력(키보드)대시
        파일로부터 읽어오겠다는 의미의 코드입니다.
        단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나
        주석 처리해야 합니다.
        */
        System.setIn(new FileInputStream("C:\\sample_input11.txt"));
        
        String S;
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int test_case = 1 ; test_case <= T; ++test_case)
        {
        	L = sc.nextInt();
        	S = sc.next();
        	
            Answer = 0;

            /////////////////////////////////////////////
            
            int max = 0, tmp = 0;
            
            for(int beginIndex=0; beginIndex<L-1; beginIndex++) {
            	for(int endIndex=L; endIndex>beginIndex+2; endIndex--) {
            		String input = S.substring(beginIndex, endIndex);
            		
            		if (isPalindrome(input)) {
            			//System.out.println("input: " + input);
            			//System.out.println("output: " + isPalindrome(input));
            			tmp = input.length();
            		}
            		
            		if (max < tmp) {
            			max = tmp;
            		}
            	}
            	
            }
            
            /////////////////////////////////////////////
            
            /* 결과 값 출력 */
            System.out.println("#" + test_case + " " + max);
         }
    }

    // THT, OAAO
    public static boolean isPalindrome(String input) {
    	for(int i=0; i<input.length()/2; i++) {
    		if(input.charAt(i) != input.charAt(input.length()-1-i)) {
    			return false;
    		}
    	}
    	return true;
    }
}
