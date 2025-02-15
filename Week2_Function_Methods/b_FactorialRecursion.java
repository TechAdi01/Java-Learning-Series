package Week2_Function_Methods;

import java.util.Scanner;

public class b_FactorialRecursion {
    public static int factorial(int n){
        if (n == 0) return 1;
        return n * factorial(n-1);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = scan.nextInt();

        System.out.println("Factorial of " + num + " is " + factorial(num) );
        scan.close();
    }
}
