package Review;

public class Add {
	int a;
	int b;
	
	/**
	 * @param a
	 * @param b
	 * @param sum
	 */
	public Add(int a, int b) {
		this.a = a;
		this.b = b;
		
	}
	public int sum(int a,int b) {
	
		int sum;
		sum=a+b;
		System.out.println("sum is" + sum);
		return sum;
		
	}

public static int display(int a,int b) {
	int mul=a*b;


	return mul;
}
	
public static void main(String[] args) {
	Add a=new Add(10,30);
	
	int s=a.sum(10,40);
	
	System.out.println("mul is"+Add.display(10,30));
}
	
	
}
