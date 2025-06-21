import java.util.Scanner;

public class Replace0To1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String number=sc.nextLine();

        String result="";


        for(int i=0;i<number.length();i++){
            if(number.charAt(i)=='0'){
                result=result+ '1';
            }
            else{
                result =result+number.charAt(i);
            }
        }
        System.out.println(result);
    }
}
