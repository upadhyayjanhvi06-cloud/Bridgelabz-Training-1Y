import java.util.*;
class Multiplication
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number from(6 to 9)");
		int number =sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			int table=number*i;
			System.out.println(number+"*"+i+"="+(number*i));
		}
	}
}