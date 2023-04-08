package Day1;

public class forloop {
	public static void main(String[] arg)
	{
		int i,j,k;
		for (i = 5; i >= 1; i--) {
			//test
			//System.out.println(i);
		      for (j = 1; j <= i; j++) {
		        System.out.print("* ");
		      }
		      System.out.println();
		    }
		
		System.out.println();
		for (i = 1; i <= 5; i++) {
			//test
			//System.out.println(i);
		      for (j = 1; j <= i; j++) {
		        System.out.print("* ");
		      }
		      System.out.println();
		    }
		System.out.println();
		for (i = 1; i <= 5; i++) {
			//test
			//System.out.println(i);
		      for (j = 5; j > i; j--) {
		        System.out.print(" ");
		      }
		      for(k=1;k<=i;k++)
		      {
		    	  System.out.print("*");
		      }
		      System.out.println();
		    }
		System.out.println();
		
		
		for (i = 1; i <= 5; i++) {
			//test
			//System.out.println(i);
			 for(k=1;k<i;k++)
		      {
		    	  System.out.print(" ");
		      }
		      for (j = 5; j >=i; j--) {
		    	 
		        System.out.print("*");
		      }
		     
		      System.out.println();
		    }
		
		
	}
	

}
