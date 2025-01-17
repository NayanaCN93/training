package Inheritance;

public class Calculate extends Salary {
	float hra,pf;
	public void cal() {
		hra=basicpay*5/100;
		System.out.println("hra is " + hra);
		pf=basicpay*20/100;
		System.out.println("pf is " + pf);
	}

}
