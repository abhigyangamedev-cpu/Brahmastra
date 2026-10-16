package Sorting.ProblemSet.Medium.NeetCode;

public class BubbleSort {

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] arr){

        for(int i = 0; i < arr.length -1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {2,8,-1,12,3,11,10,6,4,9,5,7};
        printArray(arr);

        System.out.println("After Sorting");
        bubbleSort(arr);
        printArray(arr);
    }
}
