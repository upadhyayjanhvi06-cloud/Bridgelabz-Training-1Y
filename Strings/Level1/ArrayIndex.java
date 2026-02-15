import java.util.Scanner;
public class ArrayIndex {
    public static void generateException(String[] names) {
        System.out.println(names[names.length]);
    }
    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] names = new String[size];
        for (int i = 0; i < size; i++)
            names[i] = sc.next();
        generateException(names);
    }
}
