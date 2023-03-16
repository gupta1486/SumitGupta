package Day1;

public class DemoClass {
	int a,b,c;
	public static void main (String[] arg) {
		DemoClass Test = new DemoClass();
		Test.add();
		Test.subtract();
	}
	public void add()
	{
		a=5;
		b=10;
		c=a+b; 
		System.out.println("Addition of two number is : "+c);
		
	}
	
	public void subtract()
	{
		a=5;
		b=10;
		c=a-b; 
		System.out.println("Subtraction of two number is : "+c);
		
	}

}
