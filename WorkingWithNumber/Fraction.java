import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        System.out.print("Enter numerator of first fraction: ");
        int num1 = sc.nextInt();
        System.out.print("Enter denominator of first fraction: ");
        int den1 = sc.nextInt();

        System.out.print("Enter numerator of second fraction: ");
        int num2 = sc.nextInt();
        System.out.print("Enter denominator of second fraction: ");
        int den2 = sc.nextInt();

        // Step 1: LCM of denominators
        int lcm = lcm(den1, den2);

        // Step 2: Convert to like denominators and add
        int newNum1 = num1 * (lcm / den1);
        int newNum2 = num2 * (lcm / den2);
        int resultNumerator = newNum1 + newNum2;
        int resultDenominator = lcm;

        // Step 3: Simplify the result
        int gcd = gcd(resultNumerator, resultDenominator);
        resultNumerator /= gcd;
        resultDenominator /= gcd;

        // Final Output
        System.out.println("Sum of fractions: " + resultNumerator + "/" + resultDenominator);
    }

    // Function to find GCD
    public static int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to find LCM
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
