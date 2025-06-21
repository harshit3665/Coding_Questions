 import java.util.Scanner;
public class Arm {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lower limit: ");
        int lower = sc.nextInt();

        System.out.print("Enter the upper limit: ");
        int upper = sc.nextInt();

        System.out.println("Armstrong numbers between " + lower + " and " + upper + " are:");

        for (int num = lower; num <= upper; num++) {
            int temp = num;
            int digits = 0;
            int result = 0;
             int rem=0;
             int count=num;

            while (count!= 0) {
                
                digits++;
                count= count / 10;
            }

            temp = num;

            while (temp != 0) {
                 rem = temp % 10;
                result += Math.pow(rem, digits);
                temp = temp / 10;
            }

            if (result == num) {
                System.out.println(num);
            }
        }

        sc.close();
    }
}

