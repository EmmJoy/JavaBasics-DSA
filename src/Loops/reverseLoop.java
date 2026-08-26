package Loops;
import java.util.Scanner;
public class reverseLoop {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number :  ");
//        int n = sc.nextInt();
//        for (int i = n;   i>0 ; i--) {
//            System.out.println("your reverse loops is  :  "+i);
//        }

        //print 100 to 1 which are divisible with 3 in reversal way

        Scanner sc = new Scanner(System.in);

        for( int i=100;i>=1;i--)
        {
            if(i%3==0){
                System.out.println(i+"  is Divisible with 3");
            }
        }
    }
}
