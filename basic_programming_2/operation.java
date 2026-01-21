import java.util.Scanner;
class Operation
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter num 1");
		int num1=sc.nextInt();
		System.out.println("Enter num 2");
		int num2=sc.nextInt();
		double quotient=num1/num2;
		double remainder=num1%num2;
		System.out.println("The quotient is:"+quotient);
		System.out.println("The remainder is:"+remainder);
	}
}
		