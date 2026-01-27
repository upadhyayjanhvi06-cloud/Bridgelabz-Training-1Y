import java.util.*;
class Natural
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num ");
		int n=sc.nextInt();
		if(n>=0)
		{
			System.out.println("number is natural ");
	        int num =n*(n+1)/2;
		    System.out.println("sum of n natural num is:"+num);}
			else
				{
				System.out.println("not a natural num");
			}
	}
}