import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter octal number: ");
        int octal = sc.nextInt();

        int decimal = 0, power = 0;

        // Step 1: Octal to Decimal
        while (octal > 0) {
            int rem = octal % 10;
            decimal += rem * Math.pow(8, power);
            power++;
            octal /= 10;
        }

        // Step 2: Decimal to Binary
        int binary = 0;
        power = 0;
        while (decimal > 0) {
            int rem = decimal % 2;
            binary += rem * Math.pow(10, power);
            power++;
            decimal /= 2;
        }

        System.out.println("Binary is: " + binary);
    }
}
