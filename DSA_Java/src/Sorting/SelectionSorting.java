package Sorting;

public class SelectionSorting {

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] arr){

        for(int i = 0; i < arr.length - 1; i++){
            // Assuming i index as min value index
            int min_index = i;

            // Finding the min value index
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[min_index]) min_index = j;
            }

            // Swapping the i index with the min value index
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    public static void main(String[] args){
        int[] arr = {2,8,-1,12,3,11,10,6,4,9,5,7};
        printArray(arr);

        System.out.println("After Sorting");
        selectionSort(arr);
        printArray(arr);

    }
}
