import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your string => ");
        String str=sc.nextLine();
        String s="";

        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
s=s+Character.toLowerCase(str.charAt(i));
            }
            else{
                s=s+Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println("your change output is => " + s );
    }
}
