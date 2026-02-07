import java.util.*;
class Mean
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double sum=0.0;
		double meanHeight;
		double heights[]=new double[11];
		System.out.println("Enter heights of 11 players");
		for(int i=0;i<heights.length;i++)
			{ 
		        heights[i]=sc.nextDouble();
				sum=sum+heights[i];
			}
				meanHeight=sum/11;
				System.out.println("The mean height of the player is:"+meanHeight);
			
	}
}