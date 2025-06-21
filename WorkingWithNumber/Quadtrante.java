import java.util.Scanner;

public class Quadtrante {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        if(x>0 && y>0){
            System.out.println("1st quadrante");
        }
        if(x<0 && y>0){
            System.out.println("2nd quadrante");
        }
        if(x<0 && y<0){
            System.out.println("3rd quadrante");
        }
        if(x>0 && y<0){
            System.out.println("4th quadrante");
        }

        if(x==0 && y==0){
            System.out.println("origin");
        }
        if(x==0 && y!=0 ){
      System.out.println("y- axis");
        }
        if(y==0 && x!=0){
            System.out.println(" x- axis");
        }
    }
}