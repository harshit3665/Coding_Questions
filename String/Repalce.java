import java.util.Scanner;

class Replace {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String s=sc.nextLine();
     s=s.replaceAll("[^a-zA-Z]","");
     System.out.println(s);
   }
}