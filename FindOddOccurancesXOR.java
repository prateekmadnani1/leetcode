// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class FindOddOccurancesXOR {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 2;
        System.out.println(findOddOccurance(arr));
    }
    
    public static int findOddOccurance(int arr[]) {
       int result = 0;
       for (int i = 0; i < arr.length; i++) {
           result = result ^ arr[i];
       }
       return result;
    }
}