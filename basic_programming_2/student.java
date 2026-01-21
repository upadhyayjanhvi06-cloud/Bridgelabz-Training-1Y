import java.util.Scanner;
class Student 
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("pens");
		int pens=14;
		System.out.println("students");
		int student=3;
		double que=pens/student;
		System.out.println("ques :"+que);
		double remainder=pens%student;
		System.out.println("remainder is:"+remainder);
	}
}