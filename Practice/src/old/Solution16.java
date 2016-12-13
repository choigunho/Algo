package old;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution16
{
    static int Answer;
    static int N;
    static String[] S1 = new String[20];
    static String[] S2 = new String[20];
    
    public static void main(String args[]) throws Exception
    {
        /*
        아래의 메소드 호출은 앞으로 표준 입력(키보드)대시
        파일로부터 읽어오겠다는 의미의 코드입니다.
        단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나
        주석 처리해야 합니다.
        */
        System.setIn(new FileInputStream("C:\\sample_input16.txt"));
        
        /*
        표준 입력 System.in으로부터 스캐너를 만들어 데이터를 읽어옵니다.
        */
        Scanner sc = new Scanner(System.in);
        
        /* 테스트 케이스의 수를 입력 받습니다. */
        int T = sc.nextInt();
        
        for (int test_case = 1 ; test_case <= T; ++test_case)
        {
            N = sc.nextInt();
            
            for (int i = 0; i < N; i++)
            {
                S1[i] = sc.next();
            }
            
            for (int i = 0; i < N; i++)
            {
                S2[i] = sc.next();
            }
            
            Answer = 0;
            ////////////////////////
            
            List<String> SS1; 
            List<String> SS2; 
            for(int i=0; i<N; i++) {
            	SS1 = new ArrayList<>();
            	SS2 = new ArrayList<>();
            	if(S1[i].charAt(0) == S2[i].charAt(0) && S1[i].charAt(S1[i].length()-1) == S2[i].charAt(S2[i].length()-1)) {
            		for(int j=1; j<S1[i].length()-1; j++) {
            			SS1.add(S1[i].charAt(j) + "");
            			SS2.add(S2[i].charAt(j) + "");
            		}
            		Collections.sort(SS1);
            		Collections.sort(SS2);
            		
            		if(SS1.toString().equals(SS2.toString())) {
            			Answer++;
            		}
            	}
            }
            
            ////////////////////////
            
            /* 결과 값 출력 */
            System.out.println("#" + test_case + " " + Answer);
         }
    }
}
