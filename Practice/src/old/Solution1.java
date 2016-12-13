package old;
import java.io.FileInputStream;
import java.util.Scanner;

class Solution1 {

	static int Cx, Cy, R, Sx, Sy;
	static int AnswerN;
	
	public static void main(String args[]) throws Exception {
		
		System.setIn(new FileInputStream("C:\\sample_input1.txt"));
		Scanner sc = new Scanner(System.in);
		
		for(int test_case = 1; test_case <= 3; test_case++) {

			
			Cx = sc.nextInt();
			Cy = sc.nextInt();
			R = sc.nextInt();
			Sx = sc.nextInt();
			Sy = sc.nextInt();
			
			
			/*
			 * 이하 작성 
			 */
			int x = (Cx - Sx)*(Cx - Sx);
			int y = (Cy - Sy)*(Cy - Sy);
			if((x + y) <= R*R) {
				AnswerN = 1;
			} else
				AnswerN = 0;
			
			
			
			System.out.println("#" + test_case + " " + AnswerN);
		}
	}
}
