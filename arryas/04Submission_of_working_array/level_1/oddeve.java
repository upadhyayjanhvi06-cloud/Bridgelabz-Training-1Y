import java.util.*;
class OddEve
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.println("Natural number");
		} else 
		{
			System.out.println("Error");
			System.exit(0);
		}
		int even[]=new int[n/2 +1];
		int eveIndex=0;
		int odd[]=new int[n/2 +1];
		int oddIndex=0;
		for(int i=0;i<n;i++)
		{
				
			if(i%2==0)
			{
				even[eveIndex]=i;
				eveIndex++;
		    } 
				else 
				{
					odd[oddIndex]=i;
					oddIndex++;
				}
		} 
		
		for (int i=0;i<eveIndex;i++ )
		{ 
			System.out.println("Even Array:" +even[i]+ " ");
    	}
	     for(int i=0;i<oddIndex;i++){		
		 System.out.println("Odd array:" +odd[i]+ " " );}
	}
}