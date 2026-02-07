import java.util.*;
class MultipleValues
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		double arr[]=new double[10];
		double total=0.0;
		int index=0;

		while(true)
		{
			System.out.println("Enter value");
			double n=sc.nextDouble();
			
			if(n<=0)
			{
				break;
			}
		 if(index==10){
			break;
		}
		
			arr[index]=n;
			index++;
		
				
		}
	
	for(int i=0;i<index;i++){
		total=total +arr[i];
	}
	System.out.println(total);
}
}