package Java.GenericProgramming;

public interface ContainerInterface<T> {

    ContainerInterface<T> add(T item);

    T get();
}
