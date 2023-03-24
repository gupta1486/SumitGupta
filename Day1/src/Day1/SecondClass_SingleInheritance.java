package Day1;

public class SecondClass_SingleInheritance extends SingleInhertance_FirstClass
{
	public static void main(String[] args) {
		SecondClass_SingleInheritance sH = new SecondClass_SingleInheritance();
		sH.firstclass();
		sH.secondClass();
		
	}
	public void secondClass()
	{
		System.out.println("Single Inhertance SecondClass_SingleInheritance");
	}
	

}
