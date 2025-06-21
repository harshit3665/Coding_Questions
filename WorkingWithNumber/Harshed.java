import java.util.Scanner;

public class Harshed {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
           int n =sc.nextInt();

           int temp=n;
           int sum=0;

           while(temp!=0){
            int rem=n%10;
            sum=sum+rem;
            temp=temp/10;
           }

           if(n%sum==0){
            System.out.println("harshed number");
           }
           else{
            System.out.println("not");
           }
    }
}
