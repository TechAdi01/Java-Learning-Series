package Week2_Function_Methods;

import java.util.Scanner;

public class f_PalindromeString {
    public static boolean isPalindrome(String str){
        int left = 0, right = str.length() -1 ;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter String");
        String str = scan.next();

        if(isPalindrome(str)){
            System.out.println(str + " is Palindrome");
        }
        else{
            System.out.println(str + " is not Palindrome");
        }
        scan.close();
    }
}
