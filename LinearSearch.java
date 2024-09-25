
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class LinearSearch
{
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;
        int element = 5;
        if (searchElement(arr, element)) {
            System.out.println("Element present");
        } else {
            System.out.println("Element not present");
        }
    }
    
    public static boolean searchElement(int[] arr, int element) {
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] == element) {
                return true;
            }
        }
        return false;
    }
}
