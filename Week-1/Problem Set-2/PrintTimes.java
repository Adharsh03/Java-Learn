package week1;
import java.util.Scanner;

public class PrintTimes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++) {
			System.out.println(x);
		}
		sc.close();
	}
}
