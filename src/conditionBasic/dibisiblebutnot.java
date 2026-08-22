package conditionBasic;
import java.util.Scanner;
public class dibisiblebutnot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a=sc.nextInt();

        if(a%5==0 || a%3==0 ) {
            if (a % 15== 0) {
                System.out.println("Yes it dibisible with 15");
            }
            else {
                System.out.println("it is dibisible with 3 and 5 but not 15");
            }
        }
        else {
            System.out.println("Nooo it dibisible with 3 and 5");
        }

    }
}
