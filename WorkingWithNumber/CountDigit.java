import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;

        while(n>0){
            int last=n%10;
            count++;
            n=n/10;
        }
        System.out.println(count);
    }
}
