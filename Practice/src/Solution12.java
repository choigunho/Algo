import java.util.Scanner;
import java.io.FileInputStream;

class Solution12
{
    static int Answer;
    static int Y, X, N;
    
    public static void main(String args[]) throws Exception
    {
        /*
        아래의 메소드 호출은 앞으로 표준 입력(키보드)대시
        파일로부터 읽어오겠다는 의미의 코드입니다.
        단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나
        주석 처리해야 합니다.
        */
        System.setIn(new FileInputStream("C:\\sample_input12.txt"));
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int test_case = 1 ; test_case <= T; test_case++)
        {
        	Y = sc.nextInt();
        	X = sc.nextInt();
        	N = sc.nextInt();
        	
        	int room[][] = new int[Y+1][X+1];
        	for(int i=1; i<=Y; i++) {
        		for(int j=1; j<=X; j++) {
        			room[i][j] = sc.nextInt();
        		}
        	}
        	
        	int player[][] = new int[N][3];
        	for(int i=0; i<N; i++) {
        		player[i][0] = sc.nextInt(); // Y
        		player[i][1] = sc.nextInt(); // X
        		player[i][2] = sc.nextInt(); // M
        	}
        	
            /////////////////////////////////////////////
            /////////////////////////////////////////////
            Answer = 0;
            
            for(int i=0; i<N; i++) {
            	
            	int posY = player[i][0];
            	int posX = player[i][1];
            	int iter = player[i][2];
            	
            	int roomValue = room[posY][posX];
            	
            	for(int j=0; j<iter; j++) {
            		
            		int dir = roomValue/10;
            		
            		if(dir == 1) {
            			posX = posX + roomValue%10;
            		} else if(dir == 2) {
            			posY = posY + roomValue%10;
            		} else if(dir == 3) {
            			posX = posX - roomValue%10;
            		} else {
            			posY = posY - roomValue%10;
            		}
            		
            		if(posY <= 0 || posY > Y || posX <= 0 || posX > X) {
            			roomValue = 0;
            			break;
            		}
            		
            		roomValue = room[posY][posX];
            		
            	}
            	
            	Answer = Answer + roomValue * 100 - 1000;
            	
            }
            
            /* 결과 값 출력 */
            System.out.println("#" + test_case + " " + Answer);
         }
    }
}
