package Week1_Basic;

import java.util.Scanner;

public class k_SimpleInterest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Principal amount");
        double principal = scan.nextDouble();

        System.out.println("Enter Rate of Interest");
        double rate = scan.nextDouble();

        System.out.println("Enter time(in Years)");
        double time = scan.nextDouble();

        double interest = (principal * rate * time) / 100 ;
        System.out.println("Interest is =" +interest);

        scan.close();
    }
}
