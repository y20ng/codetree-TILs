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
        while(n >0){
            int tmp = n%10;
            if(tmp == 3 || tmp == 6 || tmp ==9)
                return true;
            n/=10;
        }
        return false;
    }

    public static boolean isMagicNumber(int n){
        return (n%3 == 0) || is3Num(n);
    }
}