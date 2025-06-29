import java.util.Scanner;

public class AlphabetOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your alphbet");
     char ch= sc.next().charAt(0);
     if(ch>='a' && ch<='z'  || ch>='A' && ch<='Z' ){
        System.out.println(ch + " is a alphabet");
     }
     else{
        System.out.println(ch + "not a alphabet");
     }
    }
}
