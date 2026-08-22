package conditionBasic;
import java.util.Scanner;
public class gradesheet {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number of student :");
        int a = sc.nextInt();

        if(a>100){
            System.out.println("Please give a valid Grade");
        }
        if(a>=80 && a<=100){
            System.out.println("Excellent Student");
        }
        else if(a>=70 && a<=100){
            System.out.println("Good Student");
        } else if (a>=60 && a<=100) {
            System.out.println("Bad Student");

        }
        else{
            System.out.println("You are fail.get out  from here");
        }
    }
}
