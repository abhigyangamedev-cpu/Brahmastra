package CP.Collections;

import java.util.Arrays;
import java.util.List;

public class ArrayList {

    public static <T> void traversal(List<T> values) {
        System.out.println(values);
    }

    public static <T> void updateByValue(List<T> values, T oldValue, T newValue) {
        int index = values.indexOf(oldValue);
        if (index >= 0) {
            values.set(index, newValue);
        }
    }

    public static void main(String[] args) {
        java.util.ArrayList<Integer> numbers = new java.util.ArrayList<>(Arrays.asList(1, 2, 3));
        java.util.ArrayList<String> languages = new java.util.ArrayList<>(Arrays.asList("Java", "C++", "Python"));

        System.out.println("Initial lists:");
        traversal(numbers);
        traversal(languages);

        numbers.set(1, 20);
        updateByValue(languages, "C++", "Rust");
        System.out.println("After updating by index and value:");
        traversal(numbers);
        traversal(languages);

        numbers.add(4);
        numbers.add(1, 10);
        languages.add("Go");
        languages.add(1, "Kotlin");
        System.out.println("After adding at the end and by index:");
        traversal(numbers);
        traversal(languages);

        numbers.remove(1);
        numbers.remove(Integer.valueOf(4));
        languages.remove(1);
        languages.remove("Go");
        System.out.println("After removing by index and value:");
        traversal(numbers);
        traversal(languages);

        System.out.println("Numbers empty? " + numbers.isEmpty());
        numbers.clear();
        System.out.println("Numbers empty after removing all elements? " + numbers.isEmpty());
    }
}
