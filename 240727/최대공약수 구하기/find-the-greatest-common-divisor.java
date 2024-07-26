import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	
    	int result = findMax(n,m);
    	System.out.println(result);
    }
    
    public static int findMax(int n, int m) {
    	int result = n<m ? n: m;
    	
    	for(int i=result; i>=1; i--) {
    		if(n%i == 0 && m%i==0) {
    			result = i;
    			break;
    		}
    	}
    	
    	return result;
    }
    
}