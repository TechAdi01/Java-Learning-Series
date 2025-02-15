package Week2_Function_Methods;

import java.util.Scanner;

public class d_PowerCalculation {
    public static int power(int base , int exponent){
        int result =1;
        for (int i=0 ; i< exponent;i++){
            result *= base;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Base Number");
        int num1 = scan.nextInt();

        System.out.println("Enter Exponant");
        int num2= scan.nextInt();

        System.out.println(num1 + "^" + num2 + " = " + power(num1,num2));
        scan.close();
    }
}
