package conditionBasic;
import java.util.Scanner;
public class absoluteValue {
    static void main() {
        System.out.println("Enter a number  :  ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<0)
        {
        a= a * (-1);
            System.out.println("The Absolute Value is :  "+a);
        }
        else if(a>0)
        {
            System.out.println("The Absolute Value is :  "+a);
        }
    }
}
