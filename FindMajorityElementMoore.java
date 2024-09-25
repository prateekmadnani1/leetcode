
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.*;
public class FindMajorityElementMoore
{
    public static void main(String[] args) {
        int arr[] = new int[6];
        arr[0] = 2;
        arr[1] = 2;
        arr[2] = 5;
        arr[3] = 6;
        arr[4] = 2;
        arr[5] = 2;
        System.out.println("Majority element " + findMajorityElementMoore(arr));
    }
    
    public static int findMajorityElementMoore(int[] arr) {
       int majorityIndex = 0;
       int count = 1;
       for (int i = 1; i< arr.length; i++) {
        if(arr[majorityIndex] == arr[i]) {
            count++;
        } else {
            count--;
        }
        if (count == 0) {
            majorityIndex = i;
            count = 1;
        }
       }
       if (isMajorityElement(arr, arr[majorityIndex])) {
        return arr[majorityIndex];
       } else {
        return -1;
       }
       
    }

    public static int isMajorityElement(int arr[], int majorityElement) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == majorityElement) {
                count++;
            }
        }
        if (count > arr.length/2) {
            return 1;
        } else {
            return 0;
        }
    }
}
