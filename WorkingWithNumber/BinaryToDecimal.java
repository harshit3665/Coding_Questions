import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n=sc.nextInt();
        int decimal=0;
int p=0;
        while(n!=0){
            int rem=n%10;
            decimal=decimal +rem*((int)Math.pow(2, p));
            p++;
            n=n/10;
        }

        System.out.print(decimal);
    }
}
