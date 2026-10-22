#include <iostream>
using namespace std;

int main() {
    int scores[]{100,89,78};
    cout << "Val of scores :- " << scores << endl;

    int *score_ptr{scores};
    cout << "Val of score_ptr address :- " << score_ptr << endl;
    cout << "Val of score_ptr dereferencing :- " << *score_ptr << endl;

    // 1. Arrays Subscript notation
    cout << scores[0] << endl;
    cout << scores[1] << endl;
    cout << scores[2] << endl;

    // 2. Pointer Subscript notation
    cout << score_ptr[0] << endl;
    cout << score_ptr[1] << endl;
    cout << score_ptr[2] << endl;

    // 3. Pointer offset notation
    cout << *score_ptr << endl;
    cout << *(score_ptr + 1) << endl;
    cout << *(score_ptr + 2) << endl;

    // 4. Array offset notation
    cout << *scores << endl;
    cout << *(scores + 1) << endl;
    cout << *(scores + 2) << endl;

}