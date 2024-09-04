package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[] {-4,-1,0,3,10};
        System.out.println("Original Array: " + Arrays.toString(array));

        int[] newArray = sortedSquares(array);

        System.out.println("Sorted Squares: " + Arrays.toString(newArray));
    }
    static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int place = nums.length - 1;

        int[] newArray = new int[nums.length];

        while (left <= right) {
            if ((nums[left] * nums[left]) > (nums[right] * nums[right])) {
                newArray[place] = nums[left] * nums[left];
                left++;
                place--;
            } else {
                newArray[place] = nums[right] * nums[right];
                right--;
                place--;
            }
        }
        return newArray;
    }

}