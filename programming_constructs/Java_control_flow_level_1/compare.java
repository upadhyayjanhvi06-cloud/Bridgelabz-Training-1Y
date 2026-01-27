import java.util.*;

class SumNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }else 
		{   
             int sum = 0;
             int i = 1;
             while (i <= n)
	     {
            sum =sum+ i;
            i++;
         }
        int formula = n * (n + 1) / 2;

        System.out.println("Sum using while loop = " + sum);
        System.out.println("Sum using formula = " + formula);

        if (sum == formula){
            System.out.println("Result is correct");
        }
		else
		{
            System.out.println("Result is incorrect");
		}
		}
	}
}

