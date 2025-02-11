package Week1_Control_Statements;

import java.util.Scanner;

public class i_MultiplicationTable {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Any Number");
        int num = scan.nextInt();
        for(int i=1 ; i<=10 ; i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }
        scan.close();
    }
}
