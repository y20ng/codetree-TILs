import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for(int i=a; i<=b; i++){
            if(isMagicNumber(i)){
                //System.out.printf("%d ", i);
                cnt++;
            }
        }

        System.out.println(cnt);
        
    }

    public static boolean is3Num(int n){
        if((n / 10 == 3) || (n%10 == 3)){
            return true;
        }
        else if((n / 10 == 6) || (n%10 == 6)){
            return true;
        }
        return (n / 10 == 9) || (n%10 == 9);
    }

    public static boolean isMagicNumber(int n){
        return (n%3 == 0) || is3Num(n);
    }
}