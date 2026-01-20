import java.util.*;
class Marks
{
	public static void main(String args [])
	{
	    for(int i=1;i<=10;i++)
		{
			Scanner sc=new Scanner(System.in);
			int marks=sc.nextInt();
			System.out.println("enter marks");
			{
				if(marks<50)
				{
					System.out.println("Fail");
				}
				else if(marks>=50 && marks<60)
				{
					System.out.println("d grade");
				}
				else if(marks>=60 && marks<70)
				{
					System.out.println("c garde");
				}
				else if(marks>=70 && marks<80);
				{
					System.out.println("b garde");
				}
				
				else if(marks>=80 && marks<100)
				{
					System.out.println("a garde");
				}
				else 
				{
					System.out.println("invalid marks");
				}
			}
		}
	}
}