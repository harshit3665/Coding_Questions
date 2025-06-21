public class Range {
    
 public static void main (String[]args)
  {
    int a = 5;
    int b = 10;

    int sum = getSum (0, a, b);
      System.out.println ("The sum is " + sum);
  }


  static int getSum (int sum, int a, int b)
  {

    // stop when any recursion call tries to go over b (larger number)
    if (a > b)
      return sum;

    return a + getSum (sum, a + 1, b);
  }
}