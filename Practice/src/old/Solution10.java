package old;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution10
{
    static int N, Answer1, Answer2;
    
    public static void main(String args[]) throws Exception
    {
        /*
        아래의 메소드 호출은 앞으로 표준 입력(키보드)대시
        파일로부터 읽어오겠다는 의미의 코드입니다.
        단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나
        주석 처리해야 합니다.
        */
        System.setIn(new FileInputStream("C:\\sample_input9.txt"));
        
        /*
        표준 입력 System.in으로부터 스캐너를 만들어 데이터를 읽어옵니다.
        */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int test_case = 1 ; test_case <= T; ++test_case)
        {
        	N = sc.nextInt();
        	
        	int matrix[][] = new int[N][N];
        	
        	for(int i=0; i<N; i++) {
        		for(int j=0; j<N; j++) {
        			matrix[i][j] = sc.nextInt();
        		}
        	}
            
            /////////////////////////////////////////////
            /*
             * 구현하는 부분
             */
            // matrix[1.1]부터 시작
            // N-2회 루프를 돌면서
            // 시작점부터 주위 값과 자신을 비교
            // 다 크면 Answer1++, 다 작으면 Answer2++
            /////////////////////////////////////////////
            Answer1 = 0;
            Answer2 = 0;
            
            for(int i=1; i<N-1; i++) {
            	for(int j=1; j<N-1; j++) {
            		if(matrix[i][j] > matrix[i-1][j] &&
            			matrix[i][j] > matrix[i-1][j+1] &&
            			matrix[i][j] > matrix[i][j+1] &&
            			matrix[i][j] > matrix[i+1][j+1] &&
            			matrix[i][j] > matrix[i+1][j] &&
            			matrix[i][j] > matrix[i+1][j-1] &&
            			matrix[i][j] > matrix[i][j-1] &&
            			matrix[i][j] > matrix[i-1][j-1]) {
            			Answer1++;
            		}
            		if(matrix[i][j] < matrix[i-1][j] &&
                		matrix[i][j] < matrix[i-1][j+1] &&
                		matrix[i][j] < matrix[i][j+1] &&
                		matrix[i][j] < matrix[i+1][j+1] &&
                		matrix[i][j] < matrix[i+1][j] &&
                		matrix[i][j] < matrix[i+1][j-1] &&
                		matrix[i][j] < matrix[i][j-1] &&
                		matrix[i][j] < matrix[i-1][j-1]) {
                		Answer2++;
                		}
            	}
            	
            }
            
            /* 결과 값 출력 */
            System.out.println("#" + test_case + " " + Answer1 + " " + Answer2);
         }
    }
}
