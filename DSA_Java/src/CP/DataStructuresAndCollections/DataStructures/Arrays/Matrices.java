package CP.DataStructuresAndCollections.DataStructures.Arrays;

public class Matrices<T> {

    private int rows;
    private int columns;
    private Object[][] arr;

    public Matrices() {
    }

    public Matrices(T[][] values) {
        this.rows = values.length;
        this.columns = values[0].length;
        this.arr = new Object[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = values[i][j];
            }
        }
    }

    public void traversal() {
        System.out.println("Matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void updateByIndex(int row, int column, T value) {
        if (row < 0 || row >= rows ||
                column < 0 || column >= columns) {
            System.out.println("Invalid index!");
            return;
        }

        arr[row][column] = value;
    }

    public void updateByValue(T oldValue, T newValue) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (java.util.Objects.equals(arr[i][j], oldValue)) {
                    arr[i][j] = newValue;
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {

        Integer[][] values1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        String[][] values2 = {
                {"Java", "C++"},
                {"Python", "C#"}
        };

        Integer[][] values3 = {
                {10, 20},
                {30, 40},
                {50, 60}
        };

        String[][] values4 = {
                {"Unreal", "Unity"},
                {"Godot", "Blender"},
                {"C++", "Java"}
        };

        Matrices<Integer> matrix1 = new Matrices<>(values1);
        Matrices<String> matrix2 = new Matrices<>(values2);
        Matrices<Integer> matrix3 = new Matrices<>(values3);
        Matrices<String> matrix4 = new Matrices<>(values4);

        matrix1.traversal();
        matrix2.traversal();
        matrix3.traversal();
        matrix4.traversal();

        matrix1.updateByIndex(1, 1, 50);
        matrix2.updateByIndex(0, 0, "Rust");
        matrix3.updateByIndex(2, 1, 100);
        matrix4.updateByIndex(1, 0, "Maya");

        matrix1.traversal();
        matrix2.traversal();
        matrix3.traversal();
        matrix4.traversal();

        matrix1.updateByValue(9, 99);
        matrix2.updateByValue("Python", "JavaScript");
        matrix3.updateByValue(30, 300);
        matrix4.updateByValue("Blender", "Maya");

        matrix1.traversal();
        matrix2.traversal();
        matrix3.traversal();
        matrix4.traversal();
    }

}
