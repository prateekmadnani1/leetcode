
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class BinarySearch
{
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;
        int element = 5;
        if (searchElementBinary(arr, element)) {
            System.out.println("Element present");
        } else {
            System.out.println("Element not present");
        }
    }
    
    public static boolean searchElementBinary(int[] arr, int element) {
        int low = 0;
        int high = arr.length-1;
        int mid = -1;
        while (low<=high) {
            mid = low + (high-low)/2;
            if (arr[mid] == element)
                return true;
            if (arr[mid] < element) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
