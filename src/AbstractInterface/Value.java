package AbstractInterface;
import java.util.Scanner;

public class Value implements Add,Mul {


	public void numbers() {
		int a;
		int b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number");
		a=s.nextInt();
		System.out.println("Enter second number");
		b=s.nextInt();
		int m=a*b;
		System.out.println("multiplication of two numbers is: "+ m);

		int ad=a+b;
		System.out.println("sum  of two numbers is: "+ ad);

	}
	public static void main(String[] args) {
		Value v=new Value();
		v.numbers();
	}

}
