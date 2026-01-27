import java.util.*;

class LeapYear2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year:");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Year must be 1582 or later.");
        }
        else if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Year is a Leap Year");
        }
        else {
            System.out.println("Year is not a Leap Year");
        }
    }
}
