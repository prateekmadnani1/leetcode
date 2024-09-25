
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.*;
public class FindMajorityElement
{
    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 2;
        arr[4] = 3;
        arr[5] = 3;
        arr[6] = 3;
        arr[7] = 3;
        arr[8] = 3;
        arr[9] = 3;
        System.out.println("Majority element " + findMajorityElement(arr));
    }
    
    public static int findMajorityElement(int[] arr) {
        for (int i = 0; i < arr.length - (arr.length - 1)/2; i++) {
            if(arr[i] == arr[i + (arr.length - 1)/2]) {
                return arr[i];
            }
        }
        return -1;
    }
}
