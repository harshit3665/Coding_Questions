import java.util.Arrays;
import java.util.Scanner;

public class Disjoint {
    public static boolean Disjoint(int arr[], int nums[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<nums.length;j++){
                if(arr[i]==nums[j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);


        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();

        int arr[] = new int[n];
        int nums[] = new int[m];

   
        System.out.println("Enter " + n + " elements of the first array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

     
        System.out.println("Enter " + m + " elements of the second array:");
        for (int i = 0; i < m; i++) {
            nums[i] = sc.nextInt();
        }

      
        System.out.println("First Array: " + Arrays.toString(arr));
        System.out.println("Second Array: " + Arrays.toString(nums));

        System.out.println(Disjoint(arr, nums));
    }
}
