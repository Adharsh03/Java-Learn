package week1;
import java.util.Scanner;

public class NameStringChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String name = sc.next();
		String c = sc.next();
		System.out.println(num);
		System.out.println(name);
		System.out.println(c.charAt(0));
		sc.close();
		
	}
}
