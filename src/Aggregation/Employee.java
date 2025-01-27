package Aggregation;

public class Employee {
String empName;
int empId;
Car cr;
Bike bi;
/**
 * @param empname
 * @param empId
 * @param cr
 * @param bi
 */
public Employee(String empname, int empId, Car cr, Bike bi) {
	this.empName = empname;
	this.empId = empId;
	this.cr = cr;
	this.bi = bi;
}

void display() {
	System.out.println("emp name :"+empName+"  employee id:" + empId);
	System.out.println("car name:" +cr.carName+"  car color:"+cr.color+"  reg no:" + cr.regNo);
	System.out.println("bike name:"+bi.bikeName+"  reg no:"+bi.regNo);
	
}
public static void main(String[] args) {
	Car c=new Car("BMW","white",6064);
	Bike b=new Bike("CBZ",4365);
	Employee e=new Employee("Ishan",2345,c,b);
	e.display();
}
}