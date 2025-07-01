import java.util.Scanner;

public class ReplceSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your string =>");
        String s1=sc.nextLine();
          System.out.print("Enter your replace world =>");
        String replace=sc.nextLine();
         System.out.print("Enter your replace world to =>");
        String to=sc.nextLine();
            System.out.print(" your string after replace=>");
        System.out.println(replacr(s1, replace, to));

    }
    public static String replacr(String s,String s1, String s2 ){
        String result=s.replaceAll(s1, s2);
        return result;
    }
}
