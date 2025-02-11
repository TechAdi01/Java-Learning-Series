package Week1_Control_Statements;

import java.util.Scanner;

public class a_EvenOdd {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Any Number");
        int num = scan.nextInt();

        if( num % 2 == 0){
            System.out.println(num + " is Even");
        } else  {
            System.out.println(num + " is odd");
        }
        scan.close();
    }
}
