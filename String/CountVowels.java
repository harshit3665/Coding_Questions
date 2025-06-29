import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string for count vowels => ");
        String s=sc.nextLine();
        System.out.println( "Number of vowels in String is => " +  count(s));
    }

    public static int count(String str){
        int  count=0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i) == 'o' || str.charAt(i)=='u'
            || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)== 'I' || str.charAt(i)=='O' || str.charAt(i)=='U'){
                count++;
            }
        }
        return count;
    }
}
