import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[4];

        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.next();
        }
        
        for (int idx = arr.length-1; idx >=0 ;idx--) {
            System.out.println(arr[idx]);
        }
    
    }
}