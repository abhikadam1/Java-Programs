public class FindElementInInFiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5,
                6, 7, 8, 9, 10, 11,
                12, 13, 14, 15, 16, 17,
                18, 19, 20, 21, 22, 23,
                24, 25, 26, 27, 28, 29,
                30, 31, 32, 33, 34, 35,
                36, 37, 38, 39, 40, 999999999,
        };
        System.out.println(search(arr, 10));
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = 2;
        boolean runLoop = true;
        int result = -1;
        while (runLoop) {
            try {
                // Attempt to access the element at the given index
                // If the index is out of bounds, an ArrayIndexOutOfBoundsException will be
                // thrown
                // @SuppressWarnings("unused") // Suppress warning as we only care about the
                // access

                // System.out.println(start+ " "+ end+ " "+ target);
                if (arr[start] <= target && target <= arr[end]) {
                    result = elementSearch(arr, start, end, target);
                    runLoop = false;
                } else {
                    start = end + 1;
                    end = end * end;
                }
                // return true; // If no exception, the index exists
            } catch (ArrayIndexOutOfBoundsException e) {
                // System.out.println(e);
                // runLoop = false;
                return -1;
            }

        }
        return result;
    }

    static int elementSearch(int[] arr, int start, int end, int target) {
        // System.out.println(start+ " "+ end+ " "+ target);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }else if (arr[mid] > target) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
