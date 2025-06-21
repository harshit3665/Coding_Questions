import java.util.Scanner;

public class Sequence {



    public static int count(String s){
        int n=s.length();
          if(n==0 || s.charAt(0)=='0'){
            return 0;
          }
          int dp[]=new int[n+1];
          dp[0]=1; // invalid position
          dp[1]=1; // zero digit na ho

          for(int i=2;i<=n;i++){
            //single digit
            if(s.charAt(i-1)!='0'){
                dp[i]=dp[i]+dp[i-1];
            }
//check for two;
            int twodigit=Integer.parseInt(s.substring(i-2, i));

            if(twodigit>=10 && twodigit<=26){
                dp[i]=dp[i]+dp[i-2];
            }


          }
          return dp[n];

          

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        System.out.println(count(s));
    }
}
