package Week1_Control_Statements;

import java.util.Scanner;

public class f_PalindromeCheck {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any Number");
        int num = scan.nextInt();

        int originalNumber = num, reversed = 0;

        while(num > 0){
            int digit = num % 10 ;
            reversed = reversed * 10 + digit ;
            num /=10 ;
        }

        if (originalNumber == reversed){
            System.out.println( originalNumber + " is Palindrome number");
        }
        else {
            System.out.println(originalNumber + " is not Palindrome number");
        }
         scan.close();
    }
}
