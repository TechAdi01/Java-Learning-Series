package Week1_Basic;

import java.util.Scanner;

public class d_ArithmeticOperator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("Sum = " + (num1+num2));
        System.out.println("Difference = " + (num1-num2));
        System.out.println("Product= " + (num1*num2));
        System.out.println("Quotient = " + (num1/num2));
        System.out.println("Reminder = " + (num1%num2));

        scan.close();
    }
}
