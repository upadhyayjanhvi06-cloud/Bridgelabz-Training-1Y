import java.util.Scanner;

public class StringLength {

    public static int findLength(String text) {
        int count = 0;
        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                return count;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        int manual = findLength(text);
        int builtIn = text.length();

        System.out.println(manual);
        System.out.println(builtIn);

        
    }
}
