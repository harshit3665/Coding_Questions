import java.util.HashMap;
import java.util.Map;

public class SubarrayXorCounter {

    // Function to count subarrays with XOR equal to k
    public static long subarrayXor(int[] arr, int k) {
        int n = arr.length;
        int xr = 0;
        Map<Integer, Integer> mpp = new HashMap<>();

        mpp.put(xr, 1); // Initially 0 XOR has been seen once
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            xr = xr ^ arr[i];

            int x = xr ^ k;

            if (mpp.containsKey(x)) {
                cnt += mpp.get(x);
            }

            mpp.put(xr, mpp.getOrDefault(xr, 0) + 1);
        }

        return cnt;
    }

    // Main function to run the code
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4}; // Example array
        int k = 6;                   // Target XOR value

        long result = subarrayXor(arr, k);
        System.out.println("Total subarrays with XOR = " + k + " are: " + result);
    }
}
