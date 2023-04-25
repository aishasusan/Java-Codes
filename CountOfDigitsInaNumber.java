import java.util.*;
public class Main {

    public static int countOfDigits(int n) {
	
	//if entered number is 0
		if(n == 0){
		System.out.println("The number entered is Zero " + n);
		return 1;
		}

		//if a negative number is entered
		if(n < 0) {
		n = n;
		 System.out.println("The number entered is negative " + n);
		}

        int res = 0;
		while(n != 0) {
			n = n/10;
			res++;
		}
		return res;
	}

	public static void main(String args[]) {
        int n =555882244; //input the number
		System.out.println("The number of digits in " + n + " are: " + countOfDigits(n));
	}
}