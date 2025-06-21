public class Palindrom {
    public static void main(String[] args) {
        int n = 121;
        int temp = n; // store original number
        int rev = 0;

        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        if (temp == rev) {
            System.out.println("palindrome");
        } else {
            System.out.println("no");
        }
    }
}
