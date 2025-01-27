package Aggregation;

public class Book {
	String bookName;
	float price;
	Author authr;
	/**
	 * @param bookName
	 * @param price
	 * @param authr
	 */
	public Book(String bookName, float price, Author authr) {
		this.bookName = bookName;
		this.price = price;
		this.authr = authr;
	}
		
void display() {
	System.out.println("Book Name:"+ bookName+ " price: "+price);
	System.out.println("Author Name:"+authr.authorName+"  Place:" +authr.place+" author age:"+ authr.age);
	
}
public static void main(String[] args) {
	Author a=new Author("AbdulKalam","Rameswaram",75);
	Book b=new Book("Ignited Minds",500,a);
	b.display();
}
} 