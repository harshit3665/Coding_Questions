import java.util.Scanner;

public class Strong {
   static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += factorial(digit);  // factorial of each digit
            num = num / 10;
        }

        if (sum == original) {
            System.out.println(original + " is a Strong number.");
        } else {
            System.out.println(original + " is not a Strong number.");
        }
    }
}
