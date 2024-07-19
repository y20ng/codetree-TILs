import java.util.Scanner;

public class Main {
	
	public static boolean MagicNumber(int N){
		if(N % 2 == 1) {
			return false;
		}else {
			int total = 0;
			while(N > 0) {
				total += N%10;
				N/=10;
			}
			
			if(total % 5 == 0) {
				return true;
			}else
				return false;
		}
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(MagicNumber(N)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}