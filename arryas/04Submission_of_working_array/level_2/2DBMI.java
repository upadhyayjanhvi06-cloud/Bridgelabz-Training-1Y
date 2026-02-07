import java.util.*;
class BMIProgram
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of person");
		int n=sc.nextInt();
		double personData[][]=new double[n][3];
		String status[]=new String[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter weight");
			personData[i][0]=sc.nextDouble();
			System.out.println("Enter height");
			personData[i][1]=sc.nextDouble();
			
			if(personData[i][0]<=0 || personData[i][1]<=0){
				System.out.println("Invalid input,enter again");
				i--;
			}
		}
		for(int i=0;i<n;i++){
			personData[i][2]=personData[i][0]/(personData[i][1]*personData[i][1]);
			 if (personData[i][2] <= 18.4) {
                status[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                status[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
		}
		for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Height : " + personData[i][1]);
            System.out.println("Weight : " + personData[i][0]);
            System.out.println("BMI    : " + personData[i][2]);
            System.out.println("Status : " + status[i]);
            
        }
    }
}