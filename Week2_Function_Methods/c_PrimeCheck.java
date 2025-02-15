package Week2_Function_Methods;

import java.util.Scanner;

public class c_PrimeCheck {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter Any number");
        int num = scan.nextInt();

        if(isPrime(num)){
            System.out.println(num + " is Prime number");
        }
        else{
            System.out.println(num + " is not prime number");
        }
        scan.close();
    }
}

