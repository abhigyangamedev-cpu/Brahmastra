package CP.Arrays;

import java.util.Objects;

/** A small generic array list implemented with a resizable array. */
public class ArrayList<T> {

    private static final int DEFAULT_CAPACITY = 4;

    private Object[] elements;
    private int size;

    public ArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public ArrayList(T[] values) {
        Objects.requireNonNull(values, "values cannot be null");
        elements = new Object[Math.max(DEFAULT_CAPACITY, values.length)];
        for (T value : values) {
            elements[size++] = value;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void traversal() {
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }

    public void add(T value) {
        ensureCapacity();
        elements[size++] = value;
    }

    public void add(int index, T value) {
        checkPositionIndex(index);
        ensureCapacity();
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = value;
        size++;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        checkElementIndex(index);
        return (T) elements[index];
    }

    public void updateByIndex(int index, T value) {
        checkElementIndex(index);
        elements[index] = value;
    }

    public boolean updateByValue(T oldValue, T newValue) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(elements[i], oldValue)) {
                elements[i] = newValue;
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    public T remove(int index) {
        checkElementIndex(index);
        T removed = (T) elements[index];
        int elementsToMove = size - index - 1;
        if (elementsToMove > 0) {
            System.arraycopy(elements, index + 1, elements, index, elementsToMove);
        }
        elements[--size] = null;
        return removed;
    }

    public boolean removeByValue(T value) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(elements[i], value)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            elements = java.util.Arrays.copyOf(elements, elements.length * 2);
        }
    }

    private void checkElementIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
        }
    }

    private void checkPositionIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(new Integer[]{1, 2, 3});
        ArrayList<String> languages = new ArrayList<>(new String[]{"Java", "C++", "Python"});

        System.out.println("Initial lists:");
        numbers.traversal();
        languages.traversal();

        numbers.updateByIndex(1, 20);
        languages.updateByValue("C++", "Rust");
        System.out.println("After updating by index and value:");
        numbers.traversal();
        languages.traversal();

        numbers.add(4);
        numbers.add(1, 10);
        languages.add("Go");
        languages.add(1, "Kotlin");
        System.out.println("After adding at the end and by index:");
        numbers.traversal();
        languages.traversal();

        numbers.remove(1);
        numbers.removeByValue(4);
        languages.remove(1);
        languages.removeByValue("Go");
        System.out.println("After removing by index and value:");
        numbers.traversal();
        languages.traversal();

        System.out.println("Numbers empty? " + numbers.isEmpty());
        while (!numbers.isEmpty()) {
            numbers.remove(0);
        }
        System.out.println("Numbers empty after removing all elements? " + numbers.isEmpty());
    }
}
