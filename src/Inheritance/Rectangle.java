package Inheritance;

public class Rectangle extends Shape{
void drow() {
	System.out.println("This is rectangle");
	super.drow();
}
public static void main(String[] args) {
	Rectangle r=new Rectangle();
	r.drow();
}

}
