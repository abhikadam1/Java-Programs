
import java.util.Scanner;

public class FindStartAndEndPositonInSortedArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6,
                7, 8, 20, 20, 20, 20,
                20, 20, 20, 20, 20, 20,
                20, 20, 20, 20, 20, 20,
                20, 20, 20, 20, 20, 20,
                30, 31, 32, 33, 34, 35,
                36, 37, 38, 39, 40, 41,
        };
        System.err.println("Entet the target no. ");
        try (Scanner sc = new Scanner(System.in)) {
            int target = sc.nextInt();
            int firstIndex = search(arr, target, true);
            int lastIndex = -1;
            if (firstIndex != -1) {
                lastIndex = search(arr, target, false);
            }
            System.out.println(firstIndex + " , " + lastIndex);
        }
    }

    public static int search(int[] arr, int target, boolean findFirstIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (findFirstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

}
