import java.util.*;
class Bmi
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of person");
		int n=sc.nextInt();
	      double weight[]=new double[n];
		  double height[]=new double[n];
		  double bmi[]=new double[n];
		  String status[]=new String[n];
		 
         for(int i=0;i<n;i++){
			 
		  System.out.println("Enter weight of the person:");
		  weight[i]=sc.nextDouble();
		  System.out.println("Enter height of the person: ");
		  height[i]=sc.nextDouble();
		 }
		 for(int i=0;i<n;i++){
			 bmi[i]=weight[i]/(height[i]*height[i]);
	          if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
		 }
		 System.out.println("Height,Weight,bmi,status");
		 for(int i=0;i<n;i++){
			 System.out.println(height[i]+ " "+weight[i]+ " "+bmi[i]+ " "+status[i]);
		 }
	}
}
