
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.*;
public class FIndMaxDifference
{
    public static void main(String[] args) {
        int arr[] = new int[7];
        arr[0] = 4;
        arr[1] = 3;
        arr[2] = 10;
        arr[3] = 2;
        arr[4] = 9;
        arr[5] = 1;
        arr[6] = 6;
        System.out.println("Maximum difference " + findMaxDifference(arr));
    }
    
    public static int findMaxDifference(int[] arr) {
        int curMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > arr[i] && (arr[j]-arr[i])>curMax) {
                    curMax = arr[j]-arr[i];
                }
            }
        }
        return curMax;
    }
}
