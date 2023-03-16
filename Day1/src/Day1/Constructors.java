package Day1;

public class Constructors {
	
	public Constructors()
	{
		this(1,2,3);
		System.out.println("default Constructors");
	}
	public Constructors(int a)
	{
		this();
		System.out.println("one param Constructors");
	}
public Constructors(int a, int b)
{
	this(1,2,3,4);
	System.out.println("two param Constructors");
}
public Constructors(int a, int b, int c) {
	System.out.println("Three param Constructors");
	
}
public Constructors( int a, int b , int c, int d) {
	this(1);
	System.out.println("Four param Constructors");
	
}
public static void main(String[] args) {
	Constructors obj = new Constructors(1,2);
}

}
