
public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = { 0, 12, 21, 35, 40, 45, 85, 250, 32, 20, 11, 9, 5, 5, 4 };
        System.out.println(peakIndex(arr));

    }

    static int peakIndex(int[] arr) {
        int peak = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                if (arr[mid] > arr[mid - 1]) {
                    return mid;
                } else {
                    end = mid - 1;
                }
            } else {
                start = mid + 1;
            }

        }
        return peak;
    }
}
