import java.util.*;

class SumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;   
        double number;       
        while (true) {
            System.out.println("Enter a number:");
            number = sc.nextDouble();
            if (number <= 0) {
                break;    
			}				
            total = total + number;
        }
        System.out.println("Total sum = " + total);
    }
}
