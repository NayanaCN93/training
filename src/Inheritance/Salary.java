package Inheritance;

import java.util.Scanner;

public class Salary{
	float basicpay,ded,bonus;
		Scanner sc=new Scanner(System.in);
		public void details() {
			System.out.println("Enter basic pay");
			basicpay=sc.nextFloat();
			System.out.println("Enter deduction");
			ded=sc.nextFloat();
			System.out.println("Enter bonus");
			bonus=sc.nextFloat();
			
	}

}
