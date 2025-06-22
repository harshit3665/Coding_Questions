import java.util.Scanner;

public class Largest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
             int arr[]=new int[n];
             for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
             }
             Largest(arr);
    }
    public static void Largest(int arr[]){
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i+1];

            }
        }
         System.out.println("Largest element: " + largest);
    }
}