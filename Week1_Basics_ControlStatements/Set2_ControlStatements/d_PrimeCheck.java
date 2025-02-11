package Week1_Control_Statements;

import java.util.Scanner;

public class d_PrimeCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = scan.nextInt();

        if (num <= 1) {
            System.out.println(num + " is not a prime number");
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not a prime number");
                    return;
                }
            }
            System.out.println(num + " is a prime number");
        }
        scan.close();
    }
}
