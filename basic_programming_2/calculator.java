import java.util.Scanner;
class Calculator
{
	public static void main (String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number 1");
		float number1= sc.nextFloat();
		System.out.println("Enter number 2");
		float number2= sc.nextFloat();
		float addition=number1+number2;
		float subtraction =number1-number2;
		float multiplication=number1*number2;
		float division =number1/number2;
		System.out.println("The addition value of 2 numbers is:"+addition);
		System.out.println("The subtraction value of 2 numbers is:"+subtraction);
		System.out.println("The multiplication value of 2 numbers is:"+multiplication);
		System.out.println("The division value of 2 numbers is:"+division);
	}
}