import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int decimal = sc.nextInt();

        int power = 0;
        int octal = 0;

        while (decimal > 0) {
            int rem = decimal % 8;
            octal += rem * Math.pow(10, power);
            decimal = decimal / 8;
            power++;
        }

        System.out.println("Octal number: " + octal);
    }
}
