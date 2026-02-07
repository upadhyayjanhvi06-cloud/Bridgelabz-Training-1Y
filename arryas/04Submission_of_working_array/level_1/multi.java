import java.util.*;
class Multiplication
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number from (6 to 9)");
		int n=sc.nextInt();
		int result[]=new int[10];
		for(int i=0; i<result.length;i++)
		{
			result[i]=n* (i+1);
		
		System.out.println(n+"*"+(i+1)+ "=" +result[i]);
		}
	}
}