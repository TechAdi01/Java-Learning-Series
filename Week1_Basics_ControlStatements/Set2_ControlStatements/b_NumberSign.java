package Week1_Control_Statements;

import java.util.Scanner;

public class b_NumberSign {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Any number");
        int num = scan.nextInt();

        if(num > 0){
            System.out.println(num + " is Positive");
        } else if (num < 0) {
            System.out.println(num + " is Negative");
        }
        else {
            System.out.println(num + " is Zero");
        }
        scan.close();
    }

}
