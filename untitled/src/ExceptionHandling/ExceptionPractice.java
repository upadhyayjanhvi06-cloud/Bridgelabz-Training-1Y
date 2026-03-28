package ExceptionHandling;

public class Exception {
    static void ageChecker(int age)throws ArithmeticException,NullPointerException
    {
        if (age<18)

            throw new ArithmeticException("Invalid age");
    }
    public static void main(String args[]){
        try
        {
            ageChecker(10);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
