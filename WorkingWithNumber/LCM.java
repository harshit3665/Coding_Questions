import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
int hcf=0;
int lcm=0;
        for(int i=1;i<=num1 || i<=num2 ; i++){
       if(num1%i==0 && num2%i==0){
         hcf=1;
       }

        }
        lcm=(num1*num2)/hcf;
        System.out.println(lcm);
    }
}
