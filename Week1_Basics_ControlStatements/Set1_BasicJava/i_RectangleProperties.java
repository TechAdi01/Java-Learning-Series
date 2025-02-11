package Week1_Basic;

import java.util.Scanner;

//Here we find Area and Perimeter of Rectangle
public class i_RectangleProperties {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter length and Height of Rectangle");
        float length = scan.nextFloat();
        float height = scan.nextFloat();

        float area = length * height ;
        float perimeter = 2 * ( length + height) ;

        System.out.println("Area of Rectangle =" + area + "\nPerimeter of Rectangle =" + perimeter);
        scan.close();
    }
}
