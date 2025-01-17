package Inheritance;

public class Total extends Calculate {
float t;
	public void addtotal() {
		super.details();
		super.cal();
		t=basicpay+hra+bonus-ded-pf;
		System.out.println("Total salary is" + t);
	}
	
	public void slip() {
		System.out.println("Salary slip");
		System.out.println("Basic pay :"+ basicpay);
		System.out.println("Deduction :"+ ded);
		System.out.println("hra:"+ hra);
		System.out.println("pf :"+ pf);
		System.out.println("Bonus :"+ bonus);
		System.out.println("Total salary :"+ t);
	}
		
	public static void main(String[] args) {
		Total t=new Total();
		t.addtotal();
		t.slip();
	}
	}
