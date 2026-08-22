package conditionBasic;
import java.util.Scanner;
public class graphpapercordinates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x-axis : ");
        int x=sc.nextInt();
        System.out.println("Enter y-axis : ");
        int y=sc.nextInt();

        if(x==0 && y==0)
        {
            System.out.println("It Lie On Origin");
        } else if (x==0) {
            System.out.println("It Lie Y-axis");
        } else if (y==0) {
            System.out.println("It Lie X-axis");
        }

        else {
            System.out.println("It Lie on AIRRRRRRRR");
        }
    }
}
