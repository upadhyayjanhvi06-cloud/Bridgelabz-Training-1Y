import java.util.Scanner;

public class Split {

    public static int findLength(String text) {
        int count = 0;
        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (Exception e) {
                return count;
            }
        }
    }

    public static String[] splitManual(String text) {
        int length = findLength(text);
        int wordCount = 1;

        for (int i = 0; i < length; i++)
            if (text.charAt(i) == ' ')
                wordCount++;

        String[] words = new String[wordCount];
        int start = 0, index = 0;

        for (int i = 0; i <= length; i++) {
            if (i == length || text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }

    public static boolean compare(String[] a1, String[] a2) {
        if (a1.length != a2.length)
            return false;

        for (int i = 0; i < a1.length; i++)
            if (!a1[i].equals(a2[i]))
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] manual = splitManual(text);
        String[] builtIn = text.split(" ");

        System.out.println(compare(manual, builtIn));

        sc.close();
    }
}
