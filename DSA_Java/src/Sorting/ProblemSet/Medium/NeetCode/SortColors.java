package Sorting.ProblemSet.Medium.NeetCode;

public class SortColors {
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sortColors(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }

        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = key;
        }
    }

    public static void main(String[] args){
        int[] arr = {2,0,2,1,1,0};
        printArray(arr);

        System.out.println("After Sorting");
        sortColors(arr);
        printArray(arr);

    }
}
