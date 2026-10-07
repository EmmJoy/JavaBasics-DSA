package Loops;
import java.util.Scanner;
public class Continue {
    static void main() {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            for(int i=0; i<=n; i++){
                if (i%2!=0)continue;
                    System.out.println(i);

            }
    }

}
