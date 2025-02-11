package Week1_Control_Statements;
//largest number among 3
import java.util.Scanner;

public class c_LargestNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three Numbers");
        int a = scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();

        int largest = (a > b) ? ( (a > c) ? a : c ) : ((b > c) ? b :c) ;
        System.out.println(largest + " is largest number");
    }
}
