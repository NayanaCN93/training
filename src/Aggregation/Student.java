package Aggregation;

public class Student {
	String name;
	int rollno;
	Address add;
	


	/**
	 * @param name
	 * @param rollno
	 * @param add
	 */
	public Student(String name, int rollno, Address add) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.add = add;
	}
	
void display() {
	System.out.println(name + rollno);
	System.out.println(add.street + add.pin + add.dist + add.state);
	
}
public static void main(String[] args) {
	Address a =new Address("mala" ,680732,"Thrissur","kerala");
	Student s=new Student("Nayana",20, a);
	s.display();
	
	
	}}