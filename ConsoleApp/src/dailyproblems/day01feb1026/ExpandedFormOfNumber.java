package dailyproblems.day01feb1026;

public class ExpandedFormOfNumber {
    public static void main(String[] args) {

        int number = 70304;
        printExpandedForm(number);
    }

    public static void printExpandedForm(int num) {

        String str = String.valueOf(num);
        int length = str.length();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) {

            int digit = str.charAt(i) - '0';
            int placeValue = (int) Math.pow(10, length - i - 1);

            if (digit != 0) {
                result.append(digit * placeValue).append(" + ");
            }
        }

        // Remove last " + "
        if (result.length() > 0) {
            result.setLength(result.length() - 3);
        }

        System.out.println(result.toString());
    }
}
