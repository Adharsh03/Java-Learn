package week1;
import java.util.Scanner;

public class StudentMark {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		
		if(m>=90) {
			System.out.println("Grade A");
		}else if(m>=80 && m<90) {
			System.out.println("Grade B");
		}else if(m>=60 && m<80) {
			System.out.println("Grade C");
		}else if(m>=35 && m<60) {
			System.out.println("Grade D");
		}else {
			System.out.println("Grade F");
		}
		
		sc.close();
	}
}
