package AbstractInterface;
import java.util.Scanner;

public class HdfcImpl implements RBI{
	
	public void recurringDeposit(int am, int du) {
		
		float totalamount =am*(1+du*rate);
		System.out.println("Total amout after" + du + " years is:" + totalamount);
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		int amt=sc.nextInt();
		System.out.println("Enter duration");
		int duration=sc.nextInt();
		HdfcImpl h=new HdfcImpl();
		h.recurringDeposit(amt,duration);
		
		
		
	}

}
