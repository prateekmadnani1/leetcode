// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class SeparateZeroOneCountSort {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 0;
        arr[3] = 1;
        arr[4] = 0;
        int brr [] = separateZeroOne(arr);
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }
    
    public static int[] separateZeroOne(int arr[]) {
       int count = 0;
       for(int i = 0; i < arr.length; i++) {
           if(arr[i] == 0) {
               count++;
           }
       }
       int brr[] = new int[arr.length];
       for (int j = 0; j < brr.length; j++) {
           if(j<count) {
               brr[j] = 0;
           } else {
               brr[j] = 1;
           }
       }
       return brr;
    }
}