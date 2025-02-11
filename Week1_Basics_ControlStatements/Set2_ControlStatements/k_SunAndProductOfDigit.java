package Week1_Control_Statements;

import java.util.Scanner;

public class k_SunAndProductOfDigit {
  public static void main(String[] args){
      Scanner scan = new Scanner(System.in);

      System.out.println("Enter Any Number");
      int num = scan.nextInt();

      int sum=0, product = 1 , digit ;

      while (num > 0){
          digit = num % 10 ;
          sum += digit;
          product *= digit ;
          num /= 10;
      }
      System.out.println("Sum of number : " + sum);
      System.out.println("Product of number :" + product);
  }


}
