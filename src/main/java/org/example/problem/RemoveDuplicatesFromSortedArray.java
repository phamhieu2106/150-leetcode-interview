package org.example.problem;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    ///         RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
    public static void removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int writeIndex = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[writeIndex] = nums[i];
                writeIndex++;
            }
        }

        System.out.println(writeIndex);
        System.out.println(Arrays.toString(nums));
    }
}
