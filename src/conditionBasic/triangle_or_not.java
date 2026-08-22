package conditionBasic;
import java.util.Scanner;
public class triangle_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2nd side  : ");
        int a=sc.nextInt();
        System.out.println("Enter 1st side  : ");
        int b=sc.nextInt();
        System.out.println("Enter 3rd side  : ");
        int c=sc.nextInt();

        if(a+b> c && a+c> b && c+b> a)
        {
            System.out.println("This is a  triangle ");
        }
        else {
            System.out.println("This is ot a  triangle ");
        }
    }
}
