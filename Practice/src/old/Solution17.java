package old;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution17
{
	static int Answer[] = new int[8];
    static int Friend[] = new int[8];
    static int Me[] = new int[8];
    
    public static void main(String args[]) throws Exception
    {
        
        int test_case, T;
        System.setIn(new FileInputStream("C:\\sample_input17.txt"));
        
        /*
        표준 입력 System.in으로부터 스캐너를 만들어 데이터를 읽어옵니다.
        */
        Scanner sc = new Scanner(System.in);
        
        /* 테스트 케이스의 수를 입력 받습니다. */
        T = sc.nextInt();
        
        for (test_case = 1 ; test_case <= T; ++test_case)
        {
            
            for (int i = 0; i < 8; i++)
            {
                Friend[i] = sc.nextInt();
            }
            
            for (int i = 0; i < 8; i++)
            {
                Me[i] = sc.nextInt();
            }
            
            ////////////////////////
            int total = 0;
           	total = (Friend[0] + Me[0]) * 50000 +
           			(Friend[1] + Me[1]) * 10000 +
           			(Friend[2] + Me[2]) * 5000 +
           			(Friend[3] + Me[3]) * 1000 +
           			(Friend[4] + Me[4]) * 500 +
           			(Friend[5] + Me[5]) * 100 +
           			(Friend[6] + Me[6]) * 50 +
           			(Friend[7] + Me[7]) * 10;
           	
            Answer[0] = total/50000; //System.out.println("50,000: " + total/50000);
            Answer[1] = total%50000 / 10000; // System.out.println("10,000: " + total%50000 / 10000);
            Answer[2] = total%10000 / 5000; //System.out.println("5,000: " + total%10000 / 5000);
            Answer[3] = total%5000 / 1000; //System.out.println("1,000: " + total%5000 / 1000);
            Answer[4] = total%1000 / 500; //System.out.println("500: " + total%1000 / 500);
            Answer[5] = total%500 / 100; //System.out.println("100: " + total%500 / 100);
            Answer[6] = total%100 / 50; //System.out.println("50: " + total%100 / 50);
            Answer[7] = total%50 / 10; //System.out.println("10: " + total%50 / 10);
            
            ////////////////////////
            
            /* 결과 값 출력 */
            System.out.print("#" + test_case);
            for(int i=0; i<8; i++) {
            	System.out.print(" " + Answer[i]);
            }
            System.out.println();
         }
    }
}
