import java.util.Scanner;

public class VowelOrCon{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter your character" );
          char ch = sc.next().charAt(0);  

    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||ch=='A' || ch=='E' || ch=='I' ||ch=='O'|| ch=='U'){
        System.out.println(ch + " is a vowles ");
    }
    else{
        System.out.println(ch+ " is a consonent");
    }
    }
}