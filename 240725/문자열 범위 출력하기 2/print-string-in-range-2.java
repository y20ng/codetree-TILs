import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int x = sc.nextInt();

        if(str.length() < x){
            for(int i = 0; i < str.length(); i++)
            System.out.printf("%c",str.charAt(str.length()-1 -i));
        }
        else{
            for(int i = 0; i < x; i++)
            System.out.printf("%c",str.charAt(str.length()-1 -i));
        }
        
    }
}