
import java.util.Arrays;

public class PlusOne {
// 66. Plus One
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

// Increment the large integer by one and return the resulting array of digits.
    public static void main(String[] args) {
        int[] arr = {9, 9, 9, 9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    public static int[] plusOne(int[] digits) {
        int arrLength = digits.length;
        if (arrLength == 1) {
            if (digits[0] == 9) {
                int[] arr = {1, 0};
                return arr;
            } else {
                digits[0] += 1;
            }
        } else {
            if (digits[arrLength - 1] == 9) {
                if (digits[arrLength - 2] != 9) {
                    digits[arrLength - 2] += 1;
                    digits[arrLength - 1] = 0;
                    return digits;
                }
                digits[arrLength - 1] = 0;
                int minindex = arrLength - 1;
                for (int i = arrLength - 2; i >= 0; i--) {
                    if (digits[i] == 9) {
                        digits[i] = 0;
                        minindex = i;
                    } else {
                        break;
                    }
                }
                int newArrLength = arrLength;
                if (minindex == 0) {
                    digits[minindex] = 1;
                    newArrLength = arrLength + 1;
                } else {
                    digits[minindex - 1] += 1;
                }

                int[] newArray = new int[newArrLength];

                System.arraycopy(digits, 0, newArray, 0, arrLength);
                if (minindex == 0) {
                    newArray[arrLength] = 0;
                }
                return newArray;
            } else {
                digits[arrLength - 1] += 1;
            }
        }

        return digits;
    }
}
