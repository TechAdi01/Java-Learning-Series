package Week1_Control_Statements;

import java.util.Scanner;

public class h_FibonacciSeries {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Any number for Fibonacci Series");
        int num = scan.nextInt();

        int first = 0 , second = 1;
        System.out.print("Fibonacci Series "+ first + " " + second);

        for(int i=3 ; i<=num ; i++){
            int next = first + second ;
            System.out.print(" " + next);
            first = second;
            second = next ;
        }
        scan.close();
    }
}
