
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class FindPairs
{
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 0;
        arr[3] = 6;
        arr[4] = 6;
        int element = 10;
        System.out.println("Number of Pairs are " + findPairs(arr, element));
    }
    
    public static int findPairs(int[] arr, int element) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == element) {
                    count++;
                }
            }
        }
        return count;
    }
}
