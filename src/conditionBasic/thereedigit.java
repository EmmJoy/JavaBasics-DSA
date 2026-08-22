package conditionBasic;
import java.util.Scanner;
public class thereedigit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
        if(a>9 && a<100)
        {
            System.out.println("It's a 2 digit number");
        }
        else{
            System.out.println("It's NOT a 2 digit number");
        }
    }
}
