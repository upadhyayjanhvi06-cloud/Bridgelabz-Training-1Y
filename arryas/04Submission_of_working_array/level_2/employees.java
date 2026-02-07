import java.util.*;
class Employees
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double salary[]=new double[10];
		double years[]=new double[10];
		double bonus[]=new double[10];
		double newSalary[]=new double[10];
		
		double totalBonus=0.0;
		double totalOldSalary=0.0;
		double totalNewSalary=0.0;
		
		for(int i=0;i<10;i++){
			System.out.println("Enter salary");
			salary[i]=sc.nextDouble();
			System.out.println("Enter years of service");
			years[i]=sc.nextDouble();
			
			if(salary[i]<=0||years[i]<0)
			{
				System.out.println("Invalid number, enter AGAIN");
				i--;
			}
		}
		for(int i=0;i<10;i++){
			if(years[i]>5){
				bonus[i]=(5/100)*salary[i];
			}else
			{
				bonus[i]=(2/100)*salary[1];
			}
			newSalary[i]=salary[i]+bonus[i];
			totalBonus=totalBonus+bonus[i];
			totalOldSalary=totalOldSalary+salary[i];
			totalNewSalary=totalNewSalary+salary[i];
			
		}
		System.out.println("Total old salary:"+totalOldSalary);
		System.out.println("Total bonus :" +totalBonus);
		System.out.println("Total new salary:" +totalNewSalary);
	}	
}