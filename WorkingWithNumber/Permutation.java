import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
int fact=1;

        for(int i=1;i<=n;i++){
            fact=fact*i;

        }

        int number=n-r;
        int fact2=1;

        for (int i = 1; i <=number ;i++) {
            fact2=fact2*i;
        }
        int permutaion=fact/fact2;
        System.out.println(permutaion);
    }
}
