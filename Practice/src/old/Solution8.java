package old;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution8
{
    static int Ri, Rj;
    static int AnswerN;
    
    public static void main(String args[]) throws Exception
    {
        /*
        아래의 메소드 호출은 앞으로 표준 입력(키보드)대시
        파일로부터 읽어오겠다는 의미의 코드입니다.
        단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나
        주석 처리해야 합니다.
        */
        System.setIn(new FileInputStream("C:\\sample_input8.txt"));
        
        /*
        표준 입력 System.in으로부터 스캐너를 만들어 데이터를 읽어옵니다.
        */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int test_case = 1 ; test_case <= T; ++test_case)
        {
            Ri = sc.nextInt();
            Rj = sc.nextInt();
            
            char room[][] = new char[Ri][Rj];
            
            for(int i=0; i<Ri; i++) {
            	for(int j=0; j<Rj; j++) {
            		String tmp = sc.next();
            		room[i][j] = tmp.charAt(0);
            	}
            }
            
            /////////////////////////////////////////////
            /*
             * 구현하는 부분
             */
            // 배열의 개수만큼 루프 돌면서
            // 값이 G면,
            // 상하좌우 스캔
            // W를 만나면 중지, T를 만나면 count? 해당 좌표 저장?
            /////////////////////////////////////////////
            AnswerN = 0;
            
            for(int i=0; i<Ri; i++) {
            	for(int j=0; j<Rj; j++) {
            		if(room[i][j] == 'G') {
            			//System.out.println(room[i][j]);
            			//System.out.println("room[" + i + "][" + j + "]");
            			for(int l=j-1; l>=0; l--) {
            				if(room[i][l] == 'W' || room[i][l] == 'G') {break;}
            				else if(room[i][l] == 'T') {
            					System.out.println("left target: room[" + i + "][" + l + "]");
            					AnswerN++;
            					room[i][j] = 'W';
            					break;
            				}
            			}
            			for(int r=j+1; r<Rj; r++) {
            				if(room[i][r] == 'W' || room[i][r] == 'G') {break;}
            				else if(room[i][r] == 'T') {
            					System.out.println("right target: room[" + i + "][" + r + "]");
            					AnswerN++;
            					room[i][r] = 'W';
            					break;
            				}
            			}
            			for(int u=i-1; u>=0; u--) {
            				if(room[u][j] == 'W' || room[u][j] == 'G') {break;}
            				else if(room[u][j] == 'T') {
            					System.out.println("upper target: room[" + u + "][" + j + "]");
            					AnswerN++;
            					room[u][j] = 'W';
            					break;
            				}
            			}
            			for(int d=i+1; d<Ri; d++) {
            				if(room[d][j] == 'W' || room[d][j] == 'G') {break;}
            				else if(room[d][j] == 'T') {
            					System.out.println("upper target: room[" + d + "][" + j + "]");
            					AnswerN++;
            					room[d][j] = 'W';
            					break;
            				}
            			}
            			
            		}
            	}
            }
            
            /* 결과 값 출력 */
            System.out.println("#" + test_case + " " + AnswerN);
         }
    }
}
