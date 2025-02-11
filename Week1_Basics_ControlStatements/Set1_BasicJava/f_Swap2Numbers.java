package Week1_Basic;

import java.util.Scanner;

//using arithmetic
public class f_Swap2Numbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("Before Swapping  the value of a =" + a + " b =" + b);

        a = a + b;
        b= a- b;
        a = a -b;

        System.out.println("After Swapping the value of a =" + a + " b =" + b);
        scan.close();
    }
}
