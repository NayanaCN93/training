package encapsulation;
import java.util.Scanner;
public class User1 {
	
	
	public static void main(String[] args) {
		Bank1 b=new Bank1();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter pin");
		b.setPin(s.nextInt());
		int value=b.getPin();
		b.validate(value);
		
	}

}
