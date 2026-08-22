package basics;
import java.util.Scanner;
public class userinput {
    static void main() {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter redius:   ");
//        System.out.println();
//        double r=sc.nextDouble();
//        System.out.print("Enter pie:   ");
//        System.out.println();
//        double pie=sc.nextDouble();
//        double area=pie*r*r;
//
//
//
//        System.out.println("Your  radius is:   "+r);
//        System.out.println("Your  pie is:   "+pie);
//        System.out.println("The area  is  :    "+area);

        System.out.println("Enter first number");

        int x=sc.nextInt();
        System.out.println("Enter second number");
        int y=sc.nextInt();

        System.out.println("Sum of two numbers  :    "+(x/y));


        int i= 2*3/4+7/4+8-2+5/8;
        System.out.println("Sum of two numbers  :    "+(i));




    }
}
