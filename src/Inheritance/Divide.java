package Inheritance;

public class Divide extends Add{
	static int r;
	public void ans(int r)
	{
		int R=super.addition(20,30);
		if(R%10==0) {
			System.out.println(R +"is divisible bye 10");
			}
	    else {
				System.out.println(R +"is not divisible bye 10");
				}
			 }
		
		public static void main(String[] args) {
	    Divide d=new Divide();
		d.ans(r);
		
	
	}
}
