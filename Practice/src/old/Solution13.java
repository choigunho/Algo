package old;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution13
{
    static long Answer;
    static int N;
    
    public static void main(String args[]) throws Exception
    {
        /*
        아래의 메소드 호출은 앞으로 표준 입력(키보드)대시
        파일로부터 읽어오겠다는 의미의 코드입니다.
        단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나
        주석 처리해야 합니다.
        */
        System.setIn(new FileInputStream("C:\\sample_input13.txt"));
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int test_case = 1 ; test_case <= T; test_case++)
        {
        	N = sc.nextInt();
        	int arr[] = new int[N];
        	for(int i=0; i<N; i++) {
        		arr[i] = sc.nextInt();
        	}
        	
            /////////////////////////////////////////////
            Answer = -1;
            
            String result = "";
            for(int i=0; i<N; i++) {
            	String bs = Integer.toBinaryString(arr[i]);
            	System.out.println(bs + " length " + bs.length());
            	String dummy = "";
            	String tmp = "";
            	
            	if(bs.startsWith("1") && bs.length() < 7) {
            		for(int j=0; j<7-bs.length(); j++) {
            			dummy = dummy.concat("0");
            		}
            		tmp = dummy.concat(bs);
            		System.out.println("-> " + tmp);
            	} else if(bs.equals("0")) {
            		dummy = "000000";
            		tmp = dummy.concat(bs);
            	} else {
            		tmp = dummy.concat(bs);
            	}
            	result = result.concat(tmp);
            	System.out.println("=> " + result);
            }
            
            Answer = Long.parseLong(result, 2);
            
            
            /////////////////////////////////////////////
            
            /* 결과 값 출력 */
            System.out.println("#" + test_case + " " + Answer);
         }
    }
}
