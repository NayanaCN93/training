package encapsulation;

public class User {
	public static void main(String[] args) {
		Bank b=new Bank();
		b.setPin(2345);
		int p=b.getPin();
		System.out.println(p);}
		


}
