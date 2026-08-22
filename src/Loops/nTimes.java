package Loops;
//Print Hello World n Times and Take 'n' as input from user

import java.util.Scanner;
public class nTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  a number  :  ");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.println("Hello world  "+i);
        }
        for(int j=0;j<=100;j++){
            System.out.println(j);
        }
    }
}
