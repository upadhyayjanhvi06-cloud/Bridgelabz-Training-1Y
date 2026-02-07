import java.util.*;
class Factors
{
	public static void main (String args[])
	{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
     int n=sc.nextInt();
	int maxFactor=10;
	int factor[]=new int[maxFactor];
	int index=0;
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			if(index==maxFactor){
				maxFactor=maxFactor*2;
				int temp[]=new int[maxFactor];
				for(int j=0;j<factor.length;j++)
				{
					temp[j]=factor[j];
				}
				factor=temp;
			}
			factor[index]=i;
			index++;
		}
	}
	System.out.println("Factors of" +n+ "are:");
	for(int i=0;i<index;i++){
	System.out.println(factor[i]+ " ");
	}
	}
}