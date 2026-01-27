import java.util.*;
class Friends
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amar's age ");
		int ageAmar= sc.nextInt();
		System.out.println("Enter Amar's height");
		int heightAmar=sc.nextInt();
		
		System.out.println("Enter Akbar's age ");
		int ageAkbar= sc.nextInt();
		System.out.println("Enter Akbar's height");
		int heightAkbar=sc.nextInt();
		
		System.out.println("Enter Anthony's age ");
		int ageAnthony= sc.nextInt();
		System.out.println("Enter Anthony's height");
		int heightAnthony=sc.nextInt();
		
		if(ageAkbar<=ageAmar && ageAkbar<= ageAnthony)
		{
			System.out.println("Youngest friend is Akhbar");
        }
		else if(ageAmar<=ageAkbar && ageAmar<=ageAnthony)
		{
			System.out.println("Youngest friend is Amar");
		}else 
		{
		
			System.out.println("Youngest friend is Anthony");
		}
		if (heightAmar>= heightAkbar&& heightAmar>=heightAnthony)
		{
			
			System.out.println("Tallest friend is Amar");
		}else if(heightAkbar>=heightAmar && heightAkbar>= heightAnthony)
		{
			System.out.println(" Tallest friend is Akhabr");
		}
		else {
			System.out.println("Tallest friend is Anthony");
		}
	}
}
