import java.util.*;
class SpringSeason 
{
	public static void main (String args[])
	{ 
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter month");
	  int month=sc.nextInt();
	  System.out.println("Enter day");
	  int day=sc.nextInt();
	  if (month==March && day<=20|| month==April|| month==May||month==June && day>=20)
	  {
		  System.out.println("Its a spring season");
	  } else
	  {
		  System.out.println("Not a spring season");
	  }
	}
}
		