#include <iostream>
using namespace std;

int *createArray(size_t size, int init_val) {
    int *new_storage = new int[size];
    for (int i = 0; i < size; i++) {
        *(new_storage + i) = init_val;
    }
    return new_storage;
}

void display(const int *const array,size_t size) {
    for (int i = 0; i < size; i++) {
        cout << array[i] << " ";
    }
    cout << endl;
}

int main() {
    int* my_array{nullptr};
    size_t size;
    int init_value{};

    cout << "\nHow many integers would you like to allocate? ";
    cin >> size;

    cout << "What value would you like them initialized to? ";
    cin >> init_value;

    my_array = createArray(size, init_value);

    display(my_array, size);

    delete[] my_array;
    return 0;
}