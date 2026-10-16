package Searching;

import java.util.Scanner;

public class Search {

    public static int linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target) return i;
        }
        return Integer.MIN_VALUE;
    }

    public static int binarySearch(int[] arr, int target){
        int s = 0;
        int e = arr.length - 1;

        while (s <= e){
            int mid = s + (e-s)/2;

            if(arr[mid] == target) return mid;
            else if(target < arr[mid]) e = mid - 1;
            else s = mid + 1;
        }

        return -1;
    }


    public static void main(String[] args){

        int[] arr = {2,8,-1,12,3,11,10,6,4,9,5,7};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target");

        int target = sc.nextInt();
        System.out.println("Linear Search");

        int index_ls = linearSearch(arr,target);

        if(index_ls == -1){
            System.out.println("Element not found using Linear search !");
        }else{
            System.out.println("Element found at using Linear search : "
                    + index_ls + " index");
        }

        System.out.println("Binary Search");

        int index_bs =  binarySearch(arr,target);

        if(index_ls == -1){
            System.out.println("Element not found using Binary search !");
        }else{
            System.out.println("Element found at using Binary search : "
                    + index_bs + " index");
        }


    }
}
