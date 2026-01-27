import java.util.*;
class SumUntilBreak
{
	public static void main (String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		double num=sc.nextDouble();
		double total=0.0;
		while (true){
			System.out.println("Enter a number");
			num= sc.nextDouble();
			if(num<=0)
			{
			break;}
			total=total+num;
		}
		System.out.println("Total sum="+total);
	}
}