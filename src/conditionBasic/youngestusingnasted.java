package conditionBasic;
import java.util.Scanner;
public class youngestusingnasted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Ram Age : ");
        int a=sc.nextInt();
        System.out.println("Enter shyam Age : ");
        int b=sc.nextInt();
        System.out.println("Enter Ajay Age : ");
        int c=sc.nextInt();

        if(a>b)
        {
            if (a>c){
                System.out.println("Ram is The Youngest One "+a);
            }
            else {
                System.out.println("Ajay is The Youngest One "+c);
            }
        }
        else {
            if (b>c){
                System.out.println("Shyam is The Youngest One "+b);
            }
            else{
                System.out.println("Ram is The Youngest One "+a);
            }
        }

    }

}
