package Loops;
import java.util.Scanner;
public class geometricProgration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // print 1,2,4,8,16,32,up to n numbers

//        int a =1, d=2;
//
//        for (int i = 1; i <= n; i++) {
//            System.out.println(a);
//            a*=d;
//        }

        // print 3,12,48.......up to n numbers

        int c=3,b=4;
        for (int i = 1; i <= n; i++) {
            System.out.println(c);
            c*=b;
        }

    }
}
