import java.util.*;
class FizzBuzz
{
	public static void main(String []args)
	{
		int num=20;
		if(num<0)
		{
			System.out.println("Invalid");
			return;
		}
		
		String result[]=new String[20];
		for(int i=0; i<num;i++)
		{
		if (i%3==0 && i%5==0)
		{
			result[i]="FizzBuzz";
		}
		else if(i%3==0)
		{
			result[i]="Fizz";
		}
		else if(i%5==0)
		{
			result[i]="Buzz";
		}
		else 
		{
			result[i]=String.valueOf(i);
		}
		}
		System.out.println(Arrays.toString(result));
		
	}
}