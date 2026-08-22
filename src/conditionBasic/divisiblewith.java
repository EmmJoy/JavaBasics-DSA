package conditionBasic;
import java.util.Scanner;
public class divisiblewith {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number  : ");
        int a = sc.nextInt();
        if(a%5==0 && a%3!=0){
            System.out.println("Yes it devisible by 5 and not divisible with 3 ");
        }
        else {
            System.out.println("No it's not devisible by  5");
        }

    }
}
