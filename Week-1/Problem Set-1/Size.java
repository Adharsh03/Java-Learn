package week1;
import java.util.Scanner;

public class Size {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int si = sc.nextInt();
		
		switch(si) {
		case 29:
			System.out.println("Small");
			break;
			
		case 30:
			System.out.println("Medium");
			break;
			
		case 38:
			System.out.println("Large");
			break;
			
		case 42:
			System.out.println("XLarge");
			break;
			
			default:
				System.out.println("Invalid size");
				break;
		}
		sc.close();
	}
}
