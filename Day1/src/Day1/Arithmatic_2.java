package Day1;

public class Arithmatic_2 {
	public static void main(String[] args) {
		Arithmatic_2 obj= new Arithmatic_2();
		int A=obj.division(10,2);
		int B=obj.subtract1(A, 2);
		int C=obj.sum(B, 2);
		int D= obj.subtract2(C,2);
		obj.multiply(D, 2);

	}
	public int division(int a, int b)
	{
		int c=a/b;
		System.out.println("Result after division is : "+c);
		return c;
	}
	public int subtract1(int d, int e)
	{
		int f=d-e;
		System.out.println("Result after subtract method A is :"+f);
		return f;
	}
	public int sum(int g,int h)
	{
		int i=g+h;
		System.out.println("Result after Sum is :"+ i);
		return i;

	}
	public int subtract2(int j,int k)
	{
		int l= j-k;
		System.out.println("Result after subtract method B is : " + l);
		return l;
	}
	public void multiply(int m, int n)
	{
		int O=m*n;
		System.out.println("Final Result of Assignment 2 ((((10/2)-2)+2)-2)*2) is : " +O);
	}
	

}
