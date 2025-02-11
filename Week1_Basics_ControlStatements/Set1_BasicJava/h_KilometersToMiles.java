package Week1_Basic;

import java.util.Scanner;

public class h_KilometersToMiles {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter distance in Kilometer");
        double kilometer = scan.nextDouble();

        double miles = kilometer * 0.621371;
        System.out.println("Distance in Miles =" + miles);
         scan.close();
    }
}
