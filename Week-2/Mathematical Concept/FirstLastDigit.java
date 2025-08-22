package week2;

public class FirstLastDigit {
	public static void main(String[] args) {
		int num = 12345;
		int ld = num%10;
		int newNum = 0;
		while(num>0) {
			int di = num%10;
			newNum = newNum*10+di;
			num=num/10;
		}
		System.out.println("FirstDigit: "+newNum%10);
		System.out.println("LastDigit: "+ld);
	}
}
