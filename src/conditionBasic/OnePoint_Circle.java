package conditionBasic;
import java.util.Scanner;
public class OnePoint_Circle {
    public static void main(String[] args) {

        char m ='A';
        String ra= String.valueOf(m);
        System.out.println(ra);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x of the circle : ");
        int x = sc.nextInt();
        System.out.println("Enter the y of the circle : ");
        int y = sc.nextInt();
        System.out.println("Enter the radius of the circle : ");
        int r = sc.nextInt();

        int d=x+y;

        if(d>r){
            System.out.println("It Lie On Outside of the circle");
        } else if (d<r) {
            System.out.println("It Lie inside of the circle");

        }
        else {
            System.out.println("It Lie On The circle");
        }


    }
}
