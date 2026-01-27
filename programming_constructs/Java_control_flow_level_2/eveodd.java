import java.util.*;
class EvenOdd
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n =sc.nextInt();
		if(n>0)
		{
			System.out.println("natural number");
		}else
		{
			System.out.println("Not natural");
		}
		for(int i=1; i<=n;i++)
		{
			if(n%2==0)
			{
				System.out.println("Even number");
			}else {
				System.out.println("Odd number");
			}
		}
	}
}
		