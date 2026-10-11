package CP.DataStructuresAndCollections.Collections;

public class Arrays {

    public static void traversalForLoop(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.println("Printing Array using for loop element number with index "+ + i +" = " +a[i]);
        }
    }

    public static void traversalEnhancedLoop(int[] a){
        for(int ele : a){
            System.out.println("Printing Array using EnhancedLoop element:- "+ + ele);
        }
    }

    public static void updateByValue(int[] a, int oldValue, int newValue) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == oldValue) {
                a[i] = newValue;
                return;
            }
        }
    }

    public static void main(String[] args){
        // Creation and Initialisation
        int[] arr = {1,2,3,4,5};

        traversalForLoop(arr);
        traversalEnhancedLoop(arr);

        // Updation
        System.out.println("\nUpdating index 2 with value 10");
        arr[2] = 10;
        traversalForLoop(arr);

        System.out.println("\nReplacing value 10 with value 20");
        updateByValue(arr, 10, 20);
        traversalForLoop(arr);
        
    }
}
