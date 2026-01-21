import java.util.Scanner;
class Handshake
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students");
		int n=sc.nextInt();
		int max=(n*(n-1))/2;
		System.out.println("number of possible handshake is:"+max);
	}
}