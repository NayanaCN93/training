package AbstractInterface;

public class FullTimeEmployee extends Employee{

	void calculatesalary() {
		int workhours=8;
		System.out.println("Full time employee");
		System.out.println("Work hours of full time employee is :" +workhours);
		float totalsalary= workhours*payperhr;
		System.out.println("Total salary : " + totalsalary);
		
		
		
	}
	

	public static void main(String[] args) {
		FullTimeEmployee f=new FullTimeEmployee();
		f.calculatesalary();
		Contractor c= new Contractor();
		c.calculatesalary();
	}
}
