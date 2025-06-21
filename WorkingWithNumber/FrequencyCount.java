import java.util.Scanner;

public class FrequencyCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        long number=sc.nextLong();
        int element=sc.nextInt();
        int cnt=0;

        while (number>0) {
            int rem=(int)number%10;
            if(rem==element){
                cnt++;
            }
            number=number/10;
        }
        System.out.println(cnt);
    }
}
