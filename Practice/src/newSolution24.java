import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.io.FileInputStream;

class newSolution24
{
    static int Answer;
    static int N, M;
    static int[] B = new int[50];
    
    public static void main(String args[]) throws Exception
    {
        /*
        아래의 메소드 호출은 앞으로 표준 입력(키보드)대시
        파일로부터 읽어오겠다는 의미의 코드입니다.
        단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나
        주석 처리해야 합니다.
        */
        System.setIn(new FileInputStream("C:\\new_sample_input24.txt"));
        
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int test_case = 1 ; test_case <= T; test_case++)
        {
            N = sc.nextInt();
            M = sc.nextInt();
            
            for(int i = 0; i < N; i++) {
            	B[i] = sc.nextInt();
            }
            
            ////////////////////////
            int Answer = 0;
            
            for(int i=0; i<N; i++) {
            	
            	Calendar cal = Calendar.getInstance();
				cal.set(1900, 3, 1);
				
				System.out.println(cal.getTime());
            	
            	
            }
            
            ////////////////////////
            
            /* 결과 값 출력 */
            System.out.println("#" + test_case + " " + Answer);
         }
    }
}
