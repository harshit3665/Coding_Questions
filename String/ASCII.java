import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
System.out.print(" enter your character =>  ");
        char ch=sc.next().charAt(0);

        int i=(int)ch;

        System.out.println("ASCII value of " + ch +"is " + i);
    }
}
