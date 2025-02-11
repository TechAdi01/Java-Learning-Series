package Week1_Control_Statements;

import java.util.Scanner;

public class o_SwitchExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any Number(1-7)");
        int day = scan.nextInt();

        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid Number";
        };
        System.out.println("Day : " + dayName);
        scan.close();
    }
}