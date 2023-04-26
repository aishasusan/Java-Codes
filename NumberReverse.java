/* Program to reverse a number*/
import java.util.*;
public class NumReverse {
    public static void main(String ags[]) {
        int rev=0;
        Scanner scIP = new Scanner(System.in);
        System.out.println("Please give a number: ");
        int num = scIP.nextInt();
        System.out.println("Number before reverse : "+num);
        while(num!=0) {
            rev = rev*10 + num%10;
            num=num/10;
        }
        System.out.println("Number after reverse : "+rev);
    }
}