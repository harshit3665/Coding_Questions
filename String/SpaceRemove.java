import java.util.Scanner;

public class SpaceRemove {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

      String str=s.replaceAll(" ","");
      System.out.println(str);
    }
  
}
