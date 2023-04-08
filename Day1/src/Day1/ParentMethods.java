package Day1;

public class ParentMethods {
	public void m0()
	{
		this.m1(1);
		System.out.println("Parent Default method");
	}
	public void m1(int a)
	{
		this.m2(1, 2);
		System.out.println("Parent One param  method");
	}
	public void m2(int a, int b)
	{
		this.m3(1,2,3);
		System.out.println("Parent two param method");
	}
	public void m3(int a, int b, int c)
	{
		//this.m1(1);
		System.out.println("Parent three paramm method");
	}
	public static void main(String[] args) {
		ParentMethods pm = new ParentMethods();
				pm.m0();
	}

}
