import java.util.Scanner;

public class SmallestElement {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.print("enter length of Array : ");
        int n=sc.nextInt();
        System.out.print("enter the elemnts :");
             int arr[]=new int[n];
             for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
             }
             Smallest(arr);
    }
    public static void Smallest(int arr[]){
        int small=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        System.out.println("you smallest element is :" + small);
    }
}
