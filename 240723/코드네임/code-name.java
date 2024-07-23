import java.util.Scanner;

class User{
	char name;
	int score;
	
	public User() {
		this.name= 0;
		this.score = 0;
	}
	
	public User(char name, int score) {
		this.name = name;
		this.score = score;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User[] user = new User[5];
		
		for (int i = 0; i < user.length; i++) {
			String temp = sc.next();
			int score = sc.nextInt();
			char name  = temp.charAt(0);
			user[i] = new User(name, score);
		}
		
		int minidx = 0;
		int min = user[0].score;
		for (int i = 0; i < user.length; i++) {
			if(user[i].score < min) {
				minidx= i;
				min = user[i].score;
			}
		}
		
		System.out.println(user[minidx].name+" "+user[minidx].score);
	}
}