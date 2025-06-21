import java.util.Scanner;

public class FriendPair {
    public static int sum(int num){
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
 sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int sum1=sum(num1);
        int sum2=sum(num2);


        double ration1= (double)sum1/num1;
        double ration2=(double)sum2/num2;

        if(ration1==ration2){
            System.out.println("Friend Pair");
        }
        else{
            System.out.println("no");
        }
    }
}
