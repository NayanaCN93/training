package Aggregation;

public class LineItem {
int qty;
Product pro;
/**
 * @param qty
 */
/**
 * @param qty
 * @param pro
 */
public LineItem(int qty, Product pro) {
	this.qty = qty;
	this.pro = pro;
}
void display() {
	System.out.println("name: "+pro.name +" id :"+ pro.id +" description :" + pro.des);
	System.out.println("Quantity :"+qty);
}


public static void main(String[] args) {
	Product p=new Product("pen","Use to write",123);
	LineItem q=new LineItem(25,p);
	
	q.display();
	
}}



