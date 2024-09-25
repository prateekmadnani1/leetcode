
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.*;
public class FindMaxDifferenceDiffArray
{
    public static void main(String[] args) {
        int arr[] = new int[7];
        arr[0] = 4;
        arr[1] = 3;
        arr[2] = 10;
        arr[3] = 20;
        arr[4] = 9;
        arr[5] = 1;
        arr[6] = 6;
        System.out.println("Maximum difference " + findMaxDifferenceDiffArray(arr));
    }
    
    public static int findMaxDifferenceDiffArray(int[] arr) {
        int diff[] = new int[arr.length - 1];
        int k = 0;
        for (int i = 1; i < arr.length; i++) {
            diff[k++] = arr[i] - arr[i - 1];
        }
        int currDiff = diff[0];
        for (int i = 1; i < arr.length-1; i++) {
            if (diff[i-1]>0) {
                diff[i] = diff[i] + diff[i - 1];
            }
            currDiff = Math.max(currDiff, diff[i]);
        }
        return currDiff;
    }
}
