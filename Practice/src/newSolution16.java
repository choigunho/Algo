import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

class newSolution16
{
    static int AnswerN;
    
    public static void main(String args[]) throws Exception
    {
        /*
        아래의 메소드 호출은 앞으로 표준 입력(키보드)대시
        파일로부터 읽어오겠다는 의미의 코드입니다.
        단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나
        주석 처리해야 합니다.
        */
        System.setIn(new FileInputStream("C:\\new_sample_input16.txt"));
        
        Scanner sc = new Scanner(System.in);
        int T;
        int[] segment = new int[3];
        T = sc.nextInt();
        
        for (int test_case = 1 ; test_case <= T; test_case++)
        {
            
            for (int i = 0; i < 3; i++)
            {
                segment[i] = sc.nextInt();
            }
                        
            ////////////////////////
            AnswerN = 0;
            
            Arrays.sort(segment);
            //System.out.println(segment[0] + " " + segment[1] + " " + segment[2]);
           
            
            if(segment[2] >= segment[0] + segment[1]) {
            	AnswerN = 0;
            } else {
            	if(segment[2]*segment[2] < segment[0]*segment[0] + segment[1]*segment[1]) {
                	AnswerN = 1;
                }
            	if(segment[2]*segment[2] == segment[0]*segment[0] + segment[1]*segment[1]) {
                	AnswerN = 2;
                }
            	else if(segment[2]*segment[2] > segment[0]*segment[0] + segment[1]*segment[1]) {
                	AnswerN = 3;
                }
            }
            
            ////////////////////////
            
            /* 결과 값 출력 */
            System.out.println("#" + test_case + " " + AnswerN);
         }
    }
}
