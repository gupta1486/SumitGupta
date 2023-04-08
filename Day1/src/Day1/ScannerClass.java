package Day1;

import java.util.Scanner;

public class ScannerClass {

	public int Sum(int A,int B) {
		int C=A+B;
		return C;
	}
	public int Sub(int A, int B)
	{
		int C=A-B;
		return C;
	}
	public int Multi(int A, int B)
	{
		int C=A*B;
		return C;
	}
	public int divide(int A, int B)
	{
		int C= A/B;
		return C;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter 6 new values and hit enter after each value");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		int e=s.nextInt();
		int f=s.nextInt();
		s.close();
		ScannerClass sa= new ScannerClass();
				
		int A=sa.Sum(a, b);
		int B=sa.Sum(A, c);
		int C=sa.Sub(B,d);
		int D=sa.Multi(C,e);
		int E=sa.divide(D,f);
		System.out.println("Final Result after ((((a+b)+c)-d)*e)/f) is "+E);
	
		

	}

}
