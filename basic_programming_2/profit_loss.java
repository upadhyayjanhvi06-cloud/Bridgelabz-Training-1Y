import java.util.Scanner;
class Profit_loss
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("cost price is");
		double costprice=129;
		System.out.println("selling price is");
		double sellingprice=191;
		double profit=sellingprice-costprice;
		System.out.println("profit is:"+profit);
		double profitpercent=(profit/costprice)*100;
		System.out.println("the profit percentage is:"+profitpercent
		);
	}
}