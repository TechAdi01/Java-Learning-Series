package Week1_Control_Statements;

import java.util.Scanner;

public class n_GCD {
    public  static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Two numbers to get GCD of that :");
        int a = scan.nextInt();
        int b= scan.nextInt();

        while (b != 0){
            int temp = b ;
            b = a % b;
            a = temp;
        }
        System.out.println(a + " is GCD of your numbers");
        scan.close();
    }
}
