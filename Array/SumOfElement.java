import java.util.Scanner;

public class SumOfElement {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sum(arr);
    }
    public static void sum(int arr[]){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println("the sum of element" + sum);
    }
}
