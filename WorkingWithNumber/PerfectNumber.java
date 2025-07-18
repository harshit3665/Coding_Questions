import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int sum = 0;
        
        // Loop to find divisors
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
                System.out.print(i +" +");
            }
        }

        // Check if sum of divisors is equal to the number
        if (sum == num) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is NOT a Perfect Number.");
        }
    }
}
