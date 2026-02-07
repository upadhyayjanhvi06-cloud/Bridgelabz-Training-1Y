import java.util.*;
class NumberCheck
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int num[]=new int[5];
		System.out.println("Enter numbers");
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>0)
			{
				if(num[i]%2==0)
				{
					System.out.println("Number is even");
				}
				else
				{
					System.out.println("Number is odd");
				}
				System.out.println("Number is positive");
			}
				
				 else if(num[i]==0)
				{
					System.out.println("Number is zero");
				} 
				else 
				{
					System.out.println("Number is negative");
			    }
		}
			
			if(num[0]==num[num.length-1])
			{
				System.out.println("They are equal");
			}
		     else if (num[0]>num[num.length-1])
			{
				System.out.println("First element is greater");
			}
			else{
				System.out.println( "First element is lesser");
			}
		
	}
}