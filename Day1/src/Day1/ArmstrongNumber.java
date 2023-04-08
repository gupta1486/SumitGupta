package Day1;

public class ArmstrongNumber {	 public static void main(String args[]){  
			  int r,sum=0,temp;    
			  int n=153
					 ;//It is the number variable to be checked for ArmStrong  
			  
			  temp=n;    
			  while(n>0){    
			   r=n%10;  //getting remainder  
			   sum=sum+r*r*r;    
			   n=n/10;    
			   System.out.println();
			   System.out.println(r);
			   System.out.println(sum);
			   System.out.println(n);
			  }    
			  if(temp==sum)    
			   System.out.println("armstrong number ");    
			  else    
			   System.out.println("not armstrong");    
			}  
			}  


