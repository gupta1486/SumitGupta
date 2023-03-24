package Day1;

public class HirararchicalInheritance extends SingleInhertance_FirstClass{
	public static void main(String[] args) {
		HirararchicalInheritance hi= new HirararchicalInheritance();
		hi.Hirararchical();
		SecondClass_SingleInheritance sc = new SecondClass_SingleInheritance();
		sc.secondClass();
		
	}
	public void Hirararchical()
	{
		System.out.println("Example for HirararchicalInheritance");
	}

}
