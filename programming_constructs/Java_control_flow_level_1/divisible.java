import java.util.*;
class Divisible
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		if(number%5==0)
		{
			System.out.println("Num is divisible by 5");
			
		}else
		{
			System.out.println("Num is not divisible by 5");
		}
	}
}