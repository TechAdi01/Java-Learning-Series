package Week1_Basic;

import java.util.Scanner;

public class e_ASCIIValue {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a character");
        char ch = scan.next().charAt(0);

        int ascii = (int) ch;
        System.out.println("ASCII value of character ="+ ascii);

        scan.close();
    }
}
