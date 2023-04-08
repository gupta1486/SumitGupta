package Day1;

public class SuperMethod extends ParentMethods{
	public void s0()
	{
		this.s1(1);
		System.out.println("Child Default Method");
	}
	public void s1(int a)
	{
		this.s2(1, 2);
		System.out.println("Child One Param Method");
	}
	public void s2(int a,int b)
	{
		super.m0();
		System.out.println("Child Two param Method");
	}
	public void s3(int a, int b, int c)
	{
		this.s0();
		System.out.println("Child Three param Method");
	}
	public static void main(String[] args) {
		SuperMethod sm=new SuperMethod();
				sm.s3(1, 2, 3);
	}

}
