package conditionBasic;
import java.util.Scanner;
public class even_odd {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Even number");

        } else if (a % 2 != 0) {
            System.out.println("Odd number");

        }

        System.out.println();
        System.out.println();
        System.out.println();

        if (a % 5 == 0) {
            System.out.println(" it's divisible by 5");
        }
        else  {
            System.out.println(" it's not divisible by 5");
        }
    }
}

