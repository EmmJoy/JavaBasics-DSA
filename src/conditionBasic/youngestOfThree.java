package conditionBasic;
import java.util.Scanner;
public class youngestOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Ram Age : ");
        int a=sc.nextInt();
        System.out.println("Enter shyam Age : ");
        int b=sc.nextInt();
        System.out.println("Enter Ajay Age : ");
        int c=sc.nextInt();

        if(a<b && a<c){
            System.out.println("Ram is youngest ----- "+a);
        }
        else if(b<a && b<c){
            System.out.println("Shyam is youngest----- "+b);
        }
        else {
            System.out.println("Ajay is Youngest----- "+c);
        }
    }
}
