import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a+b;
        String num = Integer.toString(c);
        int cnt = 0;
        for(int i=0; i<num.length(); i++){
            if(num.charAt(i) == '1') {
            	cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}