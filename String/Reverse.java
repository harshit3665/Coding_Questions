import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your String for remove =>");
          String s=sc.nextLine();

          String result="";

          for(int i=s.length()-1;i>=0;i--){
            result=result+s.charAt(i);

          }
          System.out.println("your reverse String => " + result);
    }
}
