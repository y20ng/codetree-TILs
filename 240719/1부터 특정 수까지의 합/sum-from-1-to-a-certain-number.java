import java.util.Scanner;

public class Main {
	
	public static int Add(int N){
		int total = 0;
		for(int i=1; i<=N; i++) {
			total += i;
		}
		total = total/10;
        return total;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

		System.out.println(Add(N));
	}
}