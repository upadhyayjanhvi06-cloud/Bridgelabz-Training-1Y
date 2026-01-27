import java.util.*;
class Largest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num p");
		int p=sc.nextInt();
		System.out.println("Enter num q");
		int q=sc.nextInt();
		System.out.println("Enter num s");
		int s=sc.nextInt();
		if(p>q &&p>s)
		{
			System.out.println("p is largest");
		}else if(q>p && q>s)
		{
			System.out.println("q is largest");
		}else {
			System.out.println("s is largest");
		}
	}
}