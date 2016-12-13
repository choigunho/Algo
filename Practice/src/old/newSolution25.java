package old;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

class newSolution25
{
    static int Answer;
    static int N;
    static int cookie, candy, chocolate;
    static int children[][];
    
    public static void main(String args[]) throws Exception
    {
    	int test_case, T;
        /*
        아래의 메소드 호출은 앞으로 표준 입력(키보드)대시
        파일로부터 읽어오겠다는 의미의 코드입니다.
        단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나
        주석 처리해야 합니다.
        */
        System.setIn(new FileInputStream("C:\\new_sample_input25.txt"));
        
        Scanner sc = new Scanner(System.in);
        
        T = sc.nextInt();
        
        for (test_case = 1 ; test_case <= T; test_case++)
        {
            N = sc.nextInt();
            cookie = sc.nextInt();
            candy = sc.nextInt();
            chocolate = sc.nextInt();
            
            children = new int[N][3];

            for(int i=0; i<N; i++) {
            	children[i][0] = sc.nextInt();
            	children[i][1] = sc.nextInt();
            	children[i][2] = sc.nextInt();
            }
            ////////////////////////
            
            int Answer = 0;
            for(int i=0; i<N; i++) {
            	
            	int cookieR = cookie - children[i][0];
            	int candyR = candy - children[i][1];
            	int chocolateR = chocolate - children[i][2];
            	
            	if(cookieR >= 0 && candyR >= 0 && chocolateR >= 0) {
            		Answer++;
            	} else if((cookieR > 0 && candyR > 0) || (cookieR > 0 && chocolateR > 0) || (candyR > 0 && chocolateR > 0)){
            		if(cookieR > -10) {
                		if(cookieR < candyR + chocolateR) {
                			Answer++;
                		}
                	}
            		else if(candyR > -10) {
            			if(candyR < cookieR + chocolateR) {
                			Answer++;
                		}
                	}
                	if(chocolateR > -10) {
                		if(chocolateR < cookieR + candyR) {
                			Answer++;
                		}
                	}
            	}
            }
            
            ////////////////////////
            
            /* 결과 값 출력 */
            System.out.println("#" + test_case + " " + Answer);
         }
    }
}
