package Week1_Basic;

import java.util.Scanner;

public class l_SumNaturalNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Number N: ");
        int n = scan.nextInt();

        int sum =  (n * (n+1)) / 2;
        System.out.println("Sum of First " + n + " natural numbers: " + sum);

        scan.close();
    }
}
