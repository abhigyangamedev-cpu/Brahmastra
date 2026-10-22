#include <iostream>
using namespace std;

int main() {

    // 1. Integer
    int *int_ptr{nullptr};

    int_ptr = new int;

    cout << int_ptr << endl;   // Prints the address
    cout << *int_ptr << endl;  // Uninitialized value: don't read it yet

    *int_ptr = 100;            // Store a value in the allocated int
    cout << *int_ptr << endl;  // 100

    delete int_ptr;

    // 2. Array
    size_t size{};
    cin >> size;
    double *double_ptr{nullptr};

    cout<< "How many doubles ?" << endl;
    double_ptr = new double[size];
    cout << double_ptr << endl; // Address of the first double

    delete[] double_ptr;
}