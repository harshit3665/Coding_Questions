import java.util.Scanner;

public class Repeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        repeat(arr);
    }

    public static void repeat(int arr[]) {
        System.out.print("Repeated elements are: ");
        for(int i = 0; i < arr.length; i++) {
            boolean alreadyPrinted = false;

       
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            int cnt = 0;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    cnt++;
                }
            }

            if(cnt > 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
