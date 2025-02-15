package Week2_Function_Methods;

import java.util.Scanner;

public class e_DecimalToBinary {
    public static String decimalToBinary(int number){
        return Integer.toBinaryString(number);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Any numbers");
        int num = scan.nextInt();

        System.out.println("Binary of " + num + " = " + decimalToBinary(num));
        scan.close();
    }
}
