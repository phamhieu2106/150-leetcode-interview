package org.example.problem;

import java.util.Arrays;

public class RemoveElement {

    ///      RemoveElement.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);
    public static int removeElement(int[] nums, int val) {
        int indexInsert = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[indexInsert] = nums[i];
                indexInsert++;
            }
        }

        System.out.println(Arrays.toString(nums));

        return val;
    }
}
