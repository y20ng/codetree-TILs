import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        String nstr = str;
        System.out.println(str);
        for (int i = 0; i < nstr.length(); i++) {
        	str = str.substring(str.length()-1, str.length()) + str.substring(0, str.length()-1);
			System.out.println(str);
			//str = str.substring(str.length()-1, str.length()) + str.substring(0, str.length());
		}
    }
}