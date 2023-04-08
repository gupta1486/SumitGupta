package Day1;

public class ParentConstructor {
	public ParentConstructor()
	{
		this(1,2,3);
		System.out.println("Parent Default const");
	}

	public ParentConstructor(int a)
	{
		this();
		System.out.println("Parent One param const");
	}
	public ParentConstructor(int a, int b, int c)
	{
		
		System.out.println("Parent Three param const");
	}
	public ParentConstructor(int a, int b)
	{
		this(1);
		System.out.println("Parent Two Param const");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentConstructor SC=new ParentConstructor(1,2);

	}

}
