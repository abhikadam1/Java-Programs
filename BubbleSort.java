
import java.util.Arrays;
// bset case O(n)
// worst case O(n^2) 
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {  0 };
        System.out.println(Arrays.toString(BubbleSortFun(arr)));
        
    }

    public static int[] BubbleSortFun(int[] arr) {
        boolean swap = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
        return arr;
    }

}
