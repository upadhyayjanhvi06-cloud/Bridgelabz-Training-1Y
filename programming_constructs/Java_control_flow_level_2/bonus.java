import java.util.*;
class Bonus
{
	public static void main (String args[])
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter salary");
		int salary= sc.nextInt();
		System.out.println("Enter year of service");
		int years=sc.nextInt();
		 if (years>5)
		{
			int bonus=salary*5/100;
			System.out.println("Bonus amount :"+bonus);
		}else 
		{
			System.out.println("No bonus");
		}
	}
}