import java.util.Scanner;

public class CharFrequencyEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.nextLine().toLowerCase(); 

        System.out.println("Characters and their corresponding frequencies");

 
        boolean[] visited = new boolean[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if (visited[i] == true || str.charAt(i) == ' ')
                continue;

            int count = 1; 

       
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    visited[j] = true; 
                }
            }

            System.out.println(str.charAt(i) + "-" + count);
        }

        sc.close();
    }
}
