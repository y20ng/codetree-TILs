import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        
//        System.out.println(str.substring(0, 1));
        System.out.println(str.substring(1, str.length())+str.substring(0, 1));
    }
}