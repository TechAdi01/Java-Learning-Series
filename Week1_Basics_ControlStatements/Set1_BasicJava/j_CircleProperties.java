package Week1_Basic;

import java.util.Scanner;

public class j_CircleProperties {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of Radius");
        double radius = scan.nextDouble();

        double area= Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius ;

        System.out.println("Area of Circle =" + area + "\nCircumference of Circle =" + circumference);

        scan.close();
    }
}
