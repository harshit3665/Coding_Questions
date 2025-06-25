import java.util.Scanner;

public class MaximumPro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        
        int maxProduct = maxSubarrayProduct(arr);
        System.out.println("\nMaximum Subarray product is: " + maxProduct);

        sc.close();
    }

    static int maxSubarrayProduct(int arr[]) {
        int n = arr.length;
        int result = arr[0];

        for (int i = 0; i < n; i++) {
            int product = arr[i];
            result = Math.max(result, product);

            for (int j = i + 1; j < n; j++) {
                product *= arr[j];
                result = Math.max(result, product);
            }
        }

        return result;
    }
}
