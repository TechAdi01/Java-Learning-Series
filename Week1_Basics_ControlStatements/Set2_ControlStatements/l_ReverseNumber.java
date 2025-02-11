package Week1_Control_Statements;

import java.util.Scanner;

public class l_ReverseNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Any number");
        int num = scan.nextInt();

        int reversed = 0;
        while ( num > 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit ;
            num /= 10;
        }
        System.out.println(reversed + " is the Reversed number." );
        scan.close();
    }
}
