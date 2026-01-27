import java.util.*;
class Sum
{
	public static void main (String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		double num=sc.nextDouble();
		double total=0.0;
		
		while(num !=0.0)
		{
			total=total+num;
			num =sc.nextDouble();
			
		}
		System.out.println("Total sum=" + total);
	}
}
