import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String stra = sc.next();
        String strb = sc.next();

        int a = stra.length();
        int b = strb.length();

        if( a > b){
            System.out.printf("%s %d", stra, a);
        } 
        else if(a < b){
            System.out.printf("%s %d", strb, b);
        } else{
            System.out.println("same");
        }
    }
}