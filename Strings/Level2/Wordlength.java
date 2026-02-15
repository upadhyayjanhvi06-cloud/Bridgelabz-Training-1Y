import java.util.Scanner;

public class Wordlength{
    public static String[] splitManual(String text) {
        return text.split(" ");
    }

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

    public static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitManual(text);
        String[][] data = wordWithLength(words);

        for (int i = 0; i < data.length; i++)
            System.out.println(data[i][0] + "\t" + Integer.parseInt(data[i][1]));

        sc.close();
    }
}
