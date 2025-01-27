package AbstractInterface;
import java.util.Scanner;
public class  Contractor extends Employee {
	void calculatesalary() {
		
		int workhours;
		System.out.println("Contract Employee");
		System.out.println("Enter work hours:");
		Scanner sc=new Scanner(System.in);
		workhours=sc.nextInt();
		float totalsalary=workhours*payperhr;
		System.out.println("Total salary : " + totalsalary);
		
	}

}
