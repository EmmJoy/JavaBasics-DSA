package Loops;
import java.util.Scanner;
public class Ap {
    public static void main(String[] args) {

//      //  n number of terms odd number like 0,2,4,6,8
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number :  ");
//        int n = sc.nextInt();
//        int k=0;
//
//        for (int i=100;i<=(100*n);i+=100){
//            System.out.println(i);
//
//        }

        //2nd mathod
        //write a program n number of ternms 11,23,,35,47,49...

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter 1st number where you wana start with  :  ");
        int a=sc2.nextInt();
        System.out.println("Enter 2nd number where you wana end with  :  ");
        int c=sc2.nextInt();
        for (int i=0; i<c;i++){
            System.out.println(a+" ");
            a+=c;
        }

    }
}
