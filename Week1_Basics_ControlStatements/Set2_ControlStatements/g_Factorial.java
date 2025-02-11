package Week1_Control_Statements;

import java.util.Scanner;

public class g_Factorial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Any number");
        int num = scan.nextInt();

        long factorial = 1;
        for(int i=1 ; i <= num ; i++){
            factorial *= i;
        }


        System.out.println("Factorial of the " + num +"is " + factorial);
        scan.close();
    }
}
