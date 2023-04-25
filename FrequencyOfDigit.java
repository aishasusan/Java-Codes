import java.util.*;
public class Main {

    public static int countOfDigit(int n,int D) {
        if(n == 0 && D == 0) {
            System.out.println("The number entered is Zero " + n);
            return 1; //number 0 has 1 frequency of 0

        }

        //if a negative number is entered
        if(n < 0) {
            n = n;
            System.out.println("The number entered is negative " + n);
        }

        int counter = 0;
        while(n != 0) {
            int digit = n % 10; //calculate the digit
            if(digit == D) {
                counter++;
            }
            n = n/10;
        }

        return counter;
    }

    public static void main(String args[]) {

        int n = 55554455 ;//input the number
        int d = 4; //input the digit

        int x = countOfDigit(n,d);
        System.out.println("The digit " + d + " occurs " + x + " times in " + n);
    }
}