public class CommonSequence{
    public static int common(String s1, String s2 ){
        int n=s1.length()-1;
        int m=s2.length()-1;

          int dp[][]=new int[n+1][m+1]; // length of s1 and s2 is always equal


          for(int i=0;i<n;i++){                //  s1.length  
            for(int j=0;i<m;i++){            //s2.length
 if(i==0 && j==0){    // when string is khali
   dp[i][j]=0;
 } 
                 else if(s1.charAt(i-1)==s2.charAt(j-1)){    // abcdesf   //  afhskf
                    dp[i][j]=1+dp[i-1][j]+dp[i][j-1];
                 } 
                 else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1] - dp[i-1][j-1];
                 }
            }
          }
          return dp[n][m];


    }
    public static void main(String[] args) {
        
    }
}