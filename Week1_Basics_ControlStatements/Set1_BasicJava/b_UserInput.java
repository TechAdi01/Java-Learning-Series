package Week1_Basic;

import java.util.Scanner;

public class b_UserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Name");
        String name = scanner.nextLine();

        System.out.println("Enter your Age");
        int age = scanner.nextInt();

        System.out.println("Your name is " + name + " and your age is " + age);

        scanner.close();
    }
}
