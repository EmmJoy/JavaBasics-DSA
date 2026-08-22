package conditionBasic;
import java.util.Scanner;

public class cp_sp {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost Price:  ");
        int cp=sc.nextInt();
        System.out.println("Enter selling price Price:  ");
        int sp=sc.nextInt();

        if(cp<sp)
        {
            System.out.println("It's profit time");
            int j=sp-cp;
            System.out.println("He Profit:  "+j+" Taka");
        }
        else{
            System.out.println("it's totally loss");

            int i=cp-sp;
            System.out.println("He Loss:  "+i+" Taka");
        }
    }
}
