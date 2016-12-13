package old;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution9
{
    static int N, Answer;
    
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
        
        int bingoboard[][] = new int[3][5];
        
        for(int test_case=1; test_case<=T; test_case++) {
        	
            for(int i=0; i<3; i++) {
            	for(int j=0; j<5; j++) {
            		bingoboard[i][j]=sc.nextInt();
            	}
            }
            
            N = sc.nextInt();
            
            int number[] = new int[N];
            
            for(int i=0; i<N; i++) {
            	number[i]=sc.nextInt();
            }
            
            ///////////////////
            // N만큼 루프돌면서
            // 
            // bingoboard[0][0]...
            // bingoboard[1][0]...
            // bingoboard[2][0]... 
            // 각 빙고보드 첫번째 값이 number[N]와 일치하는지 확인.
            // 일치하면 -1로 바꿈
            //  
            
            Answer = 0;
            int a=0, b=0, c=0;
            
            for(int i=0; i<N; i++) {
            	
            	if(a != 5 && bingoboard[0][a] == number[i]) {
            		bingoboard[0][a] = -1;
            		a++;
            	}
            	if(b != 5 && bingoboard[1][b] == number[i]) {
            		bingoboard[1][b] = -1;
            		b++;
            	}
            	if(c != 5 && bingoboard[2][c] == number[i]) {
            		bingoboard[2][c] = -1;
            		c++;
            	}
            	
            	if(bingoboard[0][4] == -1 && bingoboard[1][4] == -1 && bingoboard[2][4] == -1) {
            		Answer = 1;
            	}
            }
            
            /* 결과 값 출력 */
            System.out.println("#" + test_case + " " + Answer);
         }
    }
}
