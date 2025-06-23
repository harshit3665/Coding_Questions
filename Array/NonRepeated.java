import java.util.Scanner;

public class NonRepeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        printNonRepeated(arr);
    }

    public static void printNonRepeated(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                }
            }

            if (cnt == 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
