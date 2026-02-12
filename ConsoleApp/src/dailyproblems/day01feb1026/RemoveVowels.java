package dailyproblems.day01feb1026;
import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(removeSingleVowels(input));
        sc.close();
    }

    public static String removeSingleVowels(String str) {
        StringBuilder result = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (isVowel(ch)) {
                boolean prevVowel = (i > 0 && isVowel(str.charAt(i - 1)));
                boolean nextVowel = (i < n - 1 && isVowel(str.charAt(i + 1)));
                if (prevVowel || nextVowel) {
                    result.append(ch);
                }
            } else
                result.append(ch);
        }
        return result.toString();
    }
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}