#include <iostream>
using namespace std;

int main() {

    // 1. Address Operator
    int x{10};
    cout << "val :- " << x << endl;
    cout << "size :- " << sizeof(x) << endl;
    cout << "address :- " << &x << endl;

    // 2. Initializing pointer to nullptr
    int *p;
    cout << "val :- " << p << endl; // garbage value
    cout << "size :- " << sizeof(p) << endl;
    cout << "address :- " << &p << endl;
    p = nullptr;
    cout << "val :- " << p << endl;

    // 3. Size of pointer variables
    int *p1{nullptr};
    double *p2{nullptr};
    unsigned long long *p3{nullptr};
    vector<string> *p4{nullptr};
    string *p5{nullptr};

    cout << sizeof(p1) << endl;
    cout << sizeof(p2) << endl;
    cout << sizeof(p3) << endl;
    cout << sizeof(p4) << endl;
    cout << sizeof(p5) << endl;

    // 4. Changing Pointer Address of Different Type is invalid
    int score{10};
    double high_temp{111.78};

    int *score_ptr{nullptr};
    score_ptr = &score;

    cout << "Val of score :- " << score << endl;
    cout << "Address of score :- " << &score << endl;
    cout << "Val of score_ptr :- " << score_ptr << endl;
}