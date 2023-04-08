package Day1;

public class SuperChild extends ParentConstructor{
	public SuperChild()
	{
		this(1,2,3);
		System.out.println("Child Default const");
	}

	public SuperChild(int a)
	{
		this();
		System.out.println("Child One param const");
	}
	public SuperChild(int a, int b, int c)
	{
		super(1,2);
		System.out.println("Child Three param const");
	}
	public SuperChild(int a, int b)
	{
		this(1);
		System.out.println("Child Two Param const");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChild SC=new SuperChild(1,2);

	}

}
