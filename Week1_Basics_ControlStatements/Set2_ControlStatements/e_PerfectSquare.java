package Week1_Control_Statements;

import java.util.Scanner;

public class e_PerfectSquare {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Any Number");
        int num = scan.nextInt();

        double sqrt = Math.sqrt(num);
        if ( sqrt == (int) sqrt){
            System.out.println( num + " is Perfect Square of " + (int) sqrt);
        }
        else{
            System.out.println(num + " is not perfect Square");
        }
        scan.close();
    }
}
