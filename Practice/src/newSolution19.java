import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

class newSolution19
{
    static double N;
    static double M;
    static double Answer;
    
    public static void main(String args[]) throws Exception
    {
        /*
        아래의 메소드 호출은 앞으로 표준 입력(키보드)대시
        파일로부터 읽어오겠다는 의미의 코드입니다.
        단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나
        주석 처리해야 합니다.
        */
        System.setIn(new FileInputStream("C:\\new_sample_input19.txt"));
        
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int test_case = 1 ; test_case <= T; test_case++)
        {
            N = sc.nextDouble();
            M = sc.nextDouble();
            
            ////////////////////////
            Answer = 0.0;
            
            
            
            ////////////////////////
            
            /* 결과 값 출력 */
            System.out.println("#" + test_case + " " + Answer);
         }
    }
}
