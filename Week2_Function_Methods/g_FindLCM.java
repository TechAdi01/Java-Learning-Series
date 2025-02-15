package Week2_Function_Methods;

import java.util.Scanner;

public class g_FindLCM {
    public static int findLCM(int a,int b){
        int max = Math.max(a,b);
        while(true){
            if(max%a == 0 && max%b ==0){
                return max;
            }
            max ++;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two number of LCM ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("LCM of "+ a + " and "+ b +" = " + findLCM(a,b) );
        scan.close();


    }
}
