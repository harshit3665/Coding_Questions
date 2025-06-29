import java.util.Scanner;

public class StringLength {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the String => ");
        String s=sc.nextLine();

               char[] chars = s.toCharArray();

               int length=0;
               for(char i=0;i<chars.length;i++ ){
                length++;
               }
               System.out.println("the length of String is => " + length);
    }
}