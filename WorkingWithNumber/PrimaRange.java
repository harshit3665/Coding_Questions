import java.util.Scanner;

public class PrimaRange {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

         for(int i=a;i<=b;i++){
            if(isprime(i)){
                System.out.println(i);
            }
         }
    }
    public static boolean isprime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<n;i++){
         if(n%i==0){
            return false;
         }
        }
        return true;
    }
}

