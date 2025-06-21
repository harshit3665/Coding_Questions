import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean isprime=true;
int n=sc.nextInt();

        if(n>=1){
            isprime=false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }
             String result = isprime ? "Prime" : "not Prime";
     System.out.println ("The number " + n + " is : " + result);
    }
}
