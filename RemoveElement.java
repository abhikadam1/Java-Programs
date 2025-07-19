
public class RemoveElement {

    // Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
    // You must write an algorithm with O(log n) runtime complexity.
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,
            6, 7, 9, 10};

        System.out.println(searchInsert(arr, 11));

    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        System.out.println(start + " " + end);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            System.out.println(start + " " + mid + " " + end);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // System.out.println(mid);
        return start;
        // return start + 1;
    }
}
