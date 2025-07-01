import java.util.Scanner;

public class RemoveBracket {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter you expression => ");
    String s=sc.nextLine();
  String str = s.replaceAll("[(){}\\[\\]]", "");
    System.out.println(str);
  }   
}
