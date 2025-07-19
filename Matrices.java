
public class Matrices {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        int[][] matrix = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7},
            {9, 10,},
            {13, 14, 15, 16}
        };

        int[] arr;
        arr = new int[]{66, 84, 52, 8};
        // System.out.println(Arrays.deepToString(matrix));
        // System.out.println(Arrays.toString(arr));
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix1.length; j++) {
                System.out.print(matrix1[j] + " ");
            }
            System.out.println();
        }
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        int mid = (start + (end - start)) / 2;
        while (start <= end) {
            mid = (start + (end - start)) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(mid);
        return mid;
    }
}
