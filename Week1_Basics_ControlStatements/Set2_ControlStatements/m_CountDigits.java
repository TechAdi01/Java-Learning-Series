package Week1_Control_Statements;

import java.util.Scanner;

public class m_CountDigits {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter any Number");
        int num = scan.nextInt();

        int count = 0;
        int temp =num;
        while(temp != 0){
            temp /= 10;
            count++;
        }
        System.out.println(count + " digits in given Number");
    }

}
