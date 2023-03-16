package Day1;

public class Arithmatic_1 {

	public static void main(String[] args) 
	{
		Arithmatic_1 obj = new Arithmatic_1();
		System.out.println("*****Assignment 1 for ((((10+2)+2)-2)*2)/2) ********");
		int A= obj.sum1(10,2);
		int B= obj.sum2(A,2);
		int C= obj.subtract(B, 2);
		int D= obj.multi(C,2);
		obj.divide(D, 2);
		
		
	}
	public int sum1(int a, int b)
	{
			int c=a+b;
			System.out.println("Result of Sum method A is "+c);
			return c;
	}
	public int sum2(int b, int c)
	{
		int d=b+c;
		System.out.println("Result of Sum Method B is "+d);
		return d;
	}
	public int subtract(int e,int f)
	{
		int g=e-f;
		System.out.println("Result after subtraction is "+g);
		return g;
	}
	public int multi(int h, int i)
	{
		int j=h*i;
		System.out.println("Result after multiplication is : "+j );
		return j;
	}
	public void divide(int k, int l)
	{
		int m=k/l;
		System.out.println("Final result for Assignment 1 for ((((10+2)+2)-2)*2)/2) : " +m);
	}
	
}
