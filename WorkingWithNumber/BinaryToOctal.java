import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        int binary = sc.nextInt();

        int decimal = 0, power = 0;

        while (binary > 0) {
            int rem = binary % 10;
            decimal += rem * Math.pow(2, power);
            power++;
            binary /= 10;
        }

      
        int octal = 0;
        power = 0;

        while (decimal > 0) {
            int rem = decimal % 8;
            octal += rem * Math.pow(10, power);
            power++;
            decimal /= 8;
        }

        System.out.println("Binary to Octal: " + octal);
    }
}
