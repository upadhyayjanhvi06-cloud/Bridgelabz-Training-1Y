import java.util.Scanner;
class IntOperation
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a");
		int a=sc.nextInt();
		System.out.println("enter b");
		int b=sc.nextInt();
		System.out.println("enterc");
		int c=sc.nextInt();
		int op1=a+b*c;
		int op2=a*b+c;
		int op3=c+a/b;
		int op4=a%b+c;
		System.out.println("result of op1 is:"+op1);
		System.out.println("result of op2 is:"+op2);
		System.out.println("result of op3 is:"+op3);
		System.out.println("result of op4 is:"+op4);
	}
}
		
		