import java.util.*;
public class ReverseArray {
    public static void main(String args[]) {


        int[] arr ;
        arr = new int[] {1,2,6,58,3,4};
        //displaying the actual array
         System.out.println("The Actual array is"+":"+"\t");
        for(int f=0; f<arr.length; f++) {
            System.out.print(arr[f] + " ");
        }

        System.out.println("\n"+"The reversed array is"+":"+"\t");
        int i = 0;
        int j = arr.length - 1;

        while(i < j) {
            //swapping ith and jth index elements
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        //displaying the reversed array
        for(int k=0; k<arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}