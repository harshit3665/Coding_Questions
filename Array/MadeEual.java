import java.util.Arrays;
import java.util.Scanner;

public class MadeEual {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();


        int arr[] = new int[n];
   

   
        System.out.println("Enter " + n + " elements of the first array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(check(arr));
}
public static boolean check(int arr[]){
    for(int i=0;i<arr.length;i++){
        while(arr[i]%2==0){
            arr[i] /=2;
        }
        while(arr[i]%3==0){
            arr[i]/=3;
        }}
  for (int i = 1; i < arr.length; i++)
            if (arr[i] != arr[0]){
                return false;
            }
        return true;
    }
}


