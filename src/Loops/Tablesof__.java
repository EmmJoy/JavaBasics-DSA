package Loops;
import java.util.Scanner;
public class Tablesof__ {
    public static void main(String[] args) {
//        for (int i=0;i<=190;i+=19){
//            System.out.println("Table Of 19  :  "+i);
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which table you wana see :  ");
        int n = sc.nextInt();
        int t= 0;
        for(int i=0;i<=100;i+=n)
        {

            System.out.println(n+" * "+t+" = "+i);
            t++;
        }

        }
    }

