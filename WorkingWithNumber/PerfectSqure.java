import java.io.*;

public class PerfectSqure {

    static void checkperfectsquare(int n) {
        if (Math.ceil((double)Math.sqrt(n)) == Math.floor((double)Math.sqrt(n))) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }

    public static void main(String[] args) {
        int n = 49;
        checkperfectsquare(n);
    }
}
