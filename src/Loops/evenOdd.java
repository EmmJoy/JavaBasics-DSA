package Loops;
import java.util.Scanner;
public class evenOdd {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<=n;i++){
            if(i%2==0){
                System.out.println("Even  :  "+i);
            }
            else{
                System.out.println("Odd  :  "+i);
            }
        }
    }
}
