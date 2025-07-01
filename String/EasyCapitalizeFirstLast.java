import java.util.Scanner;

public class EasyCapitalizeFirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {
            if (word.length() == 1) {
                result += word.toUpperCase() + " ";
            } else {
                char first = Character.toUpperCase(word.charAt(0));
                char last = Character.toUpperCase(word.charAt(word.length() - 1));
                String mid = word.substring(1, word.length() - 1);
                result += first + mid + last + " ";
            }
        }

        System.out.println("Output: " + result.trim());
    }
}
