
public class BinarySearch {

    public static void main(String[] args) {
        int[] arrAsc = {2, 5, 8, 12, 16, 23,
            38, 56, 72, 91,
            100, 120, 150, 180, 200};
        int[] arrDesc = {200, 180, 150, 120, 100,
             91, 72, 56, 38, 23, 16,
            12, 8, 5, 2};
            System.out.println(arrDesc[5]);
        System.out.println(bSearch(arrDesc, 72));
    }

    private static int bSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (end == 0) {
            return -1;
        } else if(end == 1 && arr[end] == target) {
            return end;
        }
        
        boolean isAscending = isAscending(arr, start, end);
        if (isAscending) {
            while (start <= end) {
                int mid = (start + end) / 2;
                System.out.println(start + " " + mid + " " + end);
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        } else {
            while (start <= end) {
                int mid = (start + end) / 2;
                System.out.println(start + " " + mid + " " + end);
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    private static boolean isAscending(int[] arr, int start, int end) {
        return arr[start] < arr[end];
    }
}
