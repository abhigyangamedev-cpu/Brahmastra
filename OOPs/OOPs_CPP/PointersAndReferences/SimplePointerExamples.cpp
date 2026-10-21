#include <bits/stdc++.h>
using namespace std;

int main() {

    // 1. Address Operator
    int x{10};
    cout << "val :- " << x << endl;
    cout << "size :- " << sizeof(x) << endl;
    cout << "address :- " << &x << endl;

    int *p;
    cout << "val :- " << p << endl; // garbage value
    cout << "size :- " << sizeof(p) << endl;
    cout << "address :- " << &p << endl;

    p = nullptr;
    cout << "val :- " << p << endl;
}