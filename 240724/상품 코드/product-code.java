import java.util.Scanner;

class Product{
	String name;
	int code;
	
	public Product() {};
	
	public Product(String name, int code) {
		this.name = name;
		this.code = code;
	};
	
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Product p1 = new Product("codetree", 50);
		Product p2 = new Product();
		
		p2.name = sc.next();
		p2.code = sc.nextInt();
		
		System.out.printf("product %d is %s\n", p1.code, p1.name);
		System.out.printf("product %d is %s\n", p2.code, p2.name);
		
	}
}

//branch G 34