package Day1;

public class Multilevel_inheritance extends SecondClass_SingleInheritance{
	public static void main(String[] args) {
		Multilevel_inheritance mh = new Multilevel_inheritance();
		mh.secondClass();
		mh.firstclass();
		mh.thirdClass();
		
	}
	public void thirdClass()
	{
		System.out.println("third class for Multilevel_inheritance");
	}

}
