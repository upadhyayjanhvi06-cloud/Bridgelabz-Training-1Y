import java.util.Scanner;
class University
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("fee is");
		int fee=sc.nextInt();
		System.out.println("discount percent is");
		double discountPercent=sc.nextInt();
		double discount=(discountPercent/100)*fee;
		System.out.println("The discount amount is INR:"+discount);
		double finalfee=fee-discount;
		System.out.println("final discounted fee is INR:"+ finalfee);
	}
}