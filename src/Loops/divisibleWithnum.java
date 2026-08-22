package Loops;
import java.util.Scanner;

public class divisibleWithnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int k = 0; k < n; k++) {
            if (k % 3 == 0) {
                System.out.println("Print The Number   :   " + k);
            } else if (k % 3 != 0) {
                System.out.println("It's not divisible with 3  :   " + k);
            }
        }
    }


}
