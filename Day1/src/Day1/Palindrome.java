package Day1;

public class Palindrome {
	 public static void main(String args[]){  
		  int r,sum=0,temp;    
		  int n=141
				 ;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		   System.out.println();
		   System.out.println(r);
		   System.out.println(sum);
		   System.out.println(n);
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		}  


