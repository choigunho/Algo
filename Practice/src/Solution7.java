import java.util.Scanner;
import java.io.FileInputStream;

class Solution7
{
    static int N, Si, Sj, P, D;
    static int Ai, Aj;
    
    public static void main(String args[]) throws Exception
    {
        /*
        아래의 메소드 호출은 앞으로 표준 입력(키보드)대시
        파일로부터 읽어오겠다는 의미의 코드입니다.
        단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나
        주석 처리해야 합니다.
        */
        System.setIn(new FileInputStream("C:\\sample_input7.txt"));
        
        /*
        표준 입력 System.in으로부터 스캐너를 만들어 데이터를 읽어옵니다.
        */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int test_case = 1 ; test_case <= T; ++test_case)
        {
            N = sc.nextInt();
            Si = sc.nextInt();
            Sj = sc.nextInt();
            P =  sc.nextInt();
            
            int Pi[] = new int[P];
            int Pj[] = new int[P];
            
            for(int k=0; k<P; k++) {
            	Pi[k] = sc.nextInt();
            	Pj[k] = sc.nextInt();
            }
            
            D = sc.nextInt();
            int Dd[] = new int[D];
            int Da[] = new int[D];
            for(int k=0; k<D; k++) {
            	Dd[k] = sc.nextInt();
            	Da[k] = sc.nextInt();
            }
       
            /*
             * 1. 시작 위치(Si, Sj) 저장
             * 2. 방향 지시자 개수(D)만큼 루프돌며 위치 갱신
             * 3. 좌표 밖 벗어나는지 확인(N) 
             * 4. 함정의 수(P)만큼 루프돌며 함정 확인
             * 
             */
            Ai = Si; Aj = Sj;
            
            for(int i=0; i<D; i++) {
            	if(Dd[i] == 1) {
            		Ai -= Da[i];
            	} else if(Dd[i] == 2) {
            		Ai -= Da[i]; Aj += Da[i];
            	} else if(Dd[i] == 3) {
            					 Aj += Da[i];
            	} else if(Dd[i] == 4) {
            		Ai += Da[i]; Aj += Da[i];
            	} else if(Dd[i] == 5) {
            		Ai += Da[i];
            	} else if(Dd[i] == 6) {
            		Ai += Da[i]; Aj -= Da[i];
            	} else if(Dd[i] == 7) {
            					 Aj -= Da[i];
            	} else {
            		Ai -= Da[i]; Aj -= Da[i];
            	}
            	
            	for(int j=0; j<P; j++) {
            		if(Ai == Pi[j] && Aj == Pj[j]) {
            			Ai = 0; Aj = 0;
            			break;
            		}
            	}
            	
            	if(Ai > N || Aj > N) {
            		Ai = 0; Aj = 0;
            		break;
            	}
            	
            }
            
            
            /////////////////////////////////////////////
            
            /* 결과 값 출력 */
            System.out.println("#" + test_case + " " + Ai + " " + Aj);
         }
    }
}
