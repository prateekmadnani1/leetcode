// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class FindOddOccurances {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 2;
        System.out.println(findOddOccurance(arr));
    }
    
    public static int findOddOccurance(int arr[]) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i< arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if(entry.getValue()%2 == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}