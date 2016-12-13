import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

class newSolution18
{
    static long AnswerN;
    static int N = 10;
    
    public static void main(String args[]) throws Exception
    {
        /*
        아래의 메소드 호출은 앞으로 표준 입력(키보드)대시
        파일로부터 읽어오겠다는 의미의 코드입니다.
        단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나
        주석 처리해야 합니다.
        */
        System.setIn(new FileInputStream("C:\\new_sample_input18.txt"));
        
        Scanner sc = new Scanner(System.in);
        int T;
        int[][] lotto = new int[N][6];
        int[] winner = new int[]{7, 37, 38, 39, 40, 44, 18};
        T = sc.nextInt();
        
        for (int test_case = 1 ; test_case <= T; test_case++)
        {
            N = sc.nextInt();
            
            for (int i = 0; i < N; i++) {
            	for(int j=0; j<6; j++) {
            		lotto[i][j] = sc.nextInt();
            	}
            }
                        
            ////////////////////////
            AnswerN = 0;
            
            for (int i = 0; i < N; i++) {
            	int count = 0;
            	boolean bonus = false;
            	winner[6] = 100;
            	for(int j=0; j<6; j++) {
            		int re = Arrays.binarySearch(winner, lotto[i][j]);
//            		System.out.println(lotto[i][j] + " "+ "result: " + re);
            		if(Arrays.binarySearch(winner, lotto[i][j]) >= 0) {
                		count++;
                	}
            		winner[6] = 18;
            		if(winner[6] == lotto[i][j]) {
            			bonus = true;
            		}
            		
            	}
            	
            	
            	if(count == 3) {
            		AnswerN = AnswerN + 5000;
            	} else if(count == 4) {
            		AnswerN = AnswerN + 50000;
            	} else if(count == 5 && bonus == false) {
            		AnswerN = AnswerN + 1547926;
            	} else if(count == 5 && bonus == true) {
            		AnswerN = AnswerN + 60784377;
            	} else if(count == 6) {
            		AnswerN = AnswerN + 1661439625;
            	}
//            	System.out.println(count + " " + AnswerN);
            }
            
            
            
            ////////////////////////
            
            /* 결과 값 출력 */
            System.out.println("#" + test_case + " " + AnswerN);
         }
    }
}
