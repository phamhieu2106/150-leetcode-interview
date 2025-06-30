package org.example.problem;

import java.util.Arrays;

public class MergeTwoSortedArray {

    /**
     *
     * @param nums1 array [1,1,1,0,0,0]
     * @param m elements of nums1 {3}
     * @param nums2 array [2,3,4]
     * @param n elements of nums1 {3}
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Index = m - 1;
        int nums2Index = n - 1;
        int currentIndex = m + n - 1;

        while (nums1Index >= 0 && nums2Index >= 0) {
            if (nums1[nums1Index] > nums2[nums2Index]) {
                nums1[currentIndex] = nums1[nums1Index];
                nums1Index--;
            } else {
                nums1[currentIndex] = nums2[nums2Index];
                nums2Index--;
            }
            currentIndex--;
        }

        while (nums2Index >= 0) {
            nums1[currentIndex] = nums2[nums2Index];
            nums2Index--;
            currentIndex--;
        }

        System.out.println(Arrays.toString(nums1));
    }
}
