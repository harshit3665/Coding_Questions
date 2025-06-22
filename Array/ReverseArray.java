import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Reverse(arr);

        System.out.print("Reversed Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            // Move pointers towards center
            start++;
            end--;
        }
    }
}
