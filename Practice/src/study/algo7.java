package study;
import java.util.Scanner;
import java.io.FileInputStream;

class algo7
{
    static int Answer;
    
    public static void main(String args[]) throws Exception
    {
        System.setIn(new FileInputStream("C:\\algo7.txt"));
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int G[][] = new int[11][11];
        int H[] = {1,2,3,4,5,6,7};
        
        for (int init=1 ; init<m; init++)
        {
        	int s = sc.nextInt();
        	int e = sc.nextInt();
        	int w = sc.nextInt();
        	
            G[s][e] = G[e][s] = w;
            
            
         }
        
        //System.out.println("n: " + n + "m: " + m);
        for(int i=1; i<=n; i++){
        	for(int j=i+1; j<=n; j++){ //2
        		for(int k=j+1; k<=n; k++){ //3
        			for(int l=k+1; l<=n; l++){ //4
        				for(int o=l+1; o<=n; o++){ //5
        					for(int p=o+1; p<=n; p++){ //6
        						for(int q=p+1; q<=n; q++) { //7
        							
        							System.out.println("dfdfd");
//        							System.out.println("i: " + i + " " +
//        									"j: " + j + " " +
//        									"k: " + k + " " +
//        									"l: " + l + " " +
//        									"o: " + o + " " +
//        									"p: " + p);
        						}
        					}
        				}
        			}
        		}
        	}
        }
    }
    
    public static void nextPerson(int i) {
    	System.out.println("**" + i);
    }
}
