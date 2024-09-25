
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.*;
public class FindPairsHashMap
{
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 0;
        arr[3] = 6;
        arr[4] = 6;
        int element = 8;
        System.out.println("Number of Pairs are " + findPairsHashTable(arr, element));
    }
    
    public static int findPairsHashTable(int[] arr, int element) {
        int count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(hm.containsKey(element - arr[i])) {
                count++;
            } else {
                hm.put(arr[i], 1);
            }
        }
        return count;
    }
}
