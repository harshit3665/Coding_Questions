import java.util.Scanner;

public class Distinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Number of distinct elements: " + count(arr));
    }

    public static int count(int arr[]) {
        int cnt = 0;

        for(int i = 0; i < arr.length; i++) {
            boolean isDistinct = true;

            for(int j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    isDistinct = false;
                    break;
                }
            }

            if(isDistinct) {
                cnt++;
            }
        }

        return cnt;
    }
}
