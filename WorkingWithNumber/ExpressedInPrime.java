import java.util.Scanner;

public class ExpressedInPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter your number");
        int n = sc.nextInt();

        for (int i = 2; i <= n ; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                System.out.println(n + " = " + i + " + " + (n - i));
                return; 
            }
        }

        System.out.println("no.");
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
