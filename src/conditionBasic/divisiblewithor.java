package conditionBasic;
import java.util.Scanner;
public class divisiblewithor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();

        if (a%5==0 && a%3==0) {
            System.out.println("Yes it divisible with two");

        }
        else if (a%5==0 ||a%3==0 )
        {
            System.out.println("Yes it divisible with one");
        }
        else {
            System.out.println("no it divisible with none of them");
        }

    }
}
