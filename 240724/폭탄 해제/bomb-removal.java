import java.util.Scanner;

class CodeInfo{
	String code;
	char color;
	int second;
	
	public CodeInfo() {}
	
	public CodeInfo(String code, char color, int second) {
		this.code = code;
		this.color = color;
		this.second = second;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CodeInfo codeinfo1 = new CodeInfo();
		
		codeinfo1.code = sc.next();
		codeinfo1.color = sc.next().charAt(0);
		codeinfo1.second = sc.nextInt();
		
		System.out.println("code : " + codeinfo1.code);
		System.out.println("color : " + codeinfo1.color);
		System.out.println("second : " + codeinfo1.second);
	}
}

//branch G 34