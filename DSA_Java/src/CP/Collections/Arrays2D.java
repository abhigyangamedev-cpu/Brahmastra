package CP.Collections;

public class Arrays2D {

    public static void traversalForLoop(int[][] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.println("Printing 2D Array using for loop element at index [" + i + "][" + j + "] = " + a[i][j]);
            }
        }
    }

    public static void traversalEnhancedLoop(int[][] a){
        for(int[] row : a){
            for(int ele : row){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    public static void updateByValue(int[][] a, int oldValue, int newValue) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == oldValue) {
                    a[i][j] = newValue;
                    return;
                }
            }
        }
    }

    public static void main(String[] args){

        // Creation and Initialisation
        int[][] arr = {{1,2,4},{1,3}};

        traversalForLoop(arr);
        System.out.println("\nPrinting 2D Array using EnhancedLoop:");
        traversalEnhancedLoop(arr);

        // Updation
        System.out.println("\nUpdating index [1][1] with value 10");
        arr[1][1] = 10;
        traversalEnhancedLoop(arr);

        System.out.println("\nReplacing value 10 with value 20");
        updateByValue(arr, 10, 20);
        traversalEnhancedLoop(arr);
    }
}
