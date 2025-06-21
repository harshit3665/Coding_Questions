import java.util.Scanner;

public class Abundant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        // Start from 1 to avoid divide by zero error
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }

        if (sum > num) {
            System.out.println(num + " is an Abundant number.");
        } else {
            System.out.println(num + " is NOT an Abundant number.");
        }
    }
}
