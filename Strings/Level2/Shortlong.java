import java.util.Scanner;

public class Shortlong {

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

    public static int[] findMinMax(String[] words) {
        int min = 0, max = 0;

        for (int i = 1; i < words.length; i++) {
            if (findLength(words[i]) < findLength(words[min]))
                min = i;
            if (findLength(words[i]) > findLength(words[max]))
                max = i;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitManual(text);
        int[] result = findMinMax(words);

        System.out.println("Shortest: " + words[result[0]]);
        System.out.println("Longest: " + words[result[1]]);

        sc.close();
    }
}
