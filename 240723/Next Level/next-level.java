import java.util.Scanner;

class User{
	String id;
	int level;
	
	public User() {
		this.id = "";
		this.level = 0;
	}
	
	public User(String id, int level) {
		this.id = id;
		this.level = level;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User usr1 = new User("codetree", 10);
		User usr2 = new User();
		
		usr2.id = sc.next();
		usr2.level = sc.nextInt();
		
		System.out.println("user "+usr1.id + " lv " + usr1.level);
		System.out.println("user "+usr2.id + " lv " + usr2.level);
	}
}