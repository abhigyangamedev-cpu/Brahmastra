package CP.DataStructuresAndCollections.DataStructures.Arrays;

public class Array<T> {

    private int size;
    private Object[] arr;

    public Array() {
    }

    @SafeVarargs
    public Array(T... values) {
        this.size = values.length;
        this.arr = new Object[size];

        for (int i = 0; i < size; i++) {
            arr[i] = values[i];
        }
    }

    public void traversal() {
        System.out.print("[ ");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);

            if (i < size - 1) {
                System.out.print(", ");
            }
        }

        System.out.println(" ]");
    }
    public void updateByIndex(int index, T value) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }

        arr[index] = value;
    }

    public void updateByValue(T oldValue, T newValue) {
        for (int i = 0; i < size; i++) {
            if (java.util.Objects.equals(arr[i], oldValue)) {
                arr[i] = newValue;
                return;
            }
        }
    }

    public static void main(String[] args) {
        Array<Integer> arr1 = new Array<>(1, 3, 4);
        Array<String> arr2 = new Array<>("Java", "C++", "Python");

        arr1.traversal();
        arr2.traversal();

        arr1.updateByIndex(1,10);
        arr2.updateByIndex(2,"C#");

        arr1.traversal();
        arr2.traversal();

        arr1.updateByValue(4,56);
        arr2.updateByValue("Java","Rust");

        arr1.traversal();
        arr2.traversal();

    }
}