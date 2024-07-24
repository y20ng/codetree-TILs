import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		int N = sc.nextInt();
		int[][] arr = new int[N][N];
		
		int maxcnt = 0;
		
		for(int i=0; i<N; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<N-2; i++) {
			for (int j = 0; j < N-2; j++) {
				int cnt = 0;
				
				for(int r = 0; r<3; r++) {
					for(int c = 0; c<3; c++) {
						if(arr[i+r][j+c] == 1)
							cnt++;
					}
				}
				
				maxcnt = Math.max(maxcnt, cnt);
			}
		}
		
		System.out.println(maxcnt);
	}

}