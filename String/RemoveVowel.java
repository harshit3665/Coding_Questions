import java.util.Scanner;

public class RemoveVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to remove vowels => ");
        String s = sc.nextLine();
        System.out.println("After removing vowels: " + remove(s));
    }

    public static String remove(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
