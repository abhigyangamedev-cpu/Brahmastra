package TwoPointers.Hard.LeetCode;

public class MedianOfTwoSortedArrays {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }

        while (i < m) result[k++] = nums1[i++];
        while (j < n) result[k++] = nums2[j++];

        return result;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = merge(nums1, nums1.length, nums2, nums2.length);
        int len = merged.length;

        if (len % 2 == 1) {
            return merged[len / 2];
        }

        return (merged[len / 2 - 1] + merged[len / 2]) / 2.0;
    }

    public static void main(String[] args){
        int[] a1 = {1,3};
        int[] a2 = {2};

        System.out.println("Median :- " + findMedianSortedArrays(a1,a2));
    }
}
