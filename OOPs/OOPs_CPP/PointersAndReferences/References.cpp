#include <iostream>
#include <vector>
using namespace std;

int main() {
    //1. Example 1
    int num{100};
    int &ref{num};

    cout << num << endl;
    cout << ref << endl;

    num = 200;
    cout << num << endl;
    cout << ref << endl;

    num = num * 2;
    cout << num << endl;
    cout << ref << endl;

    //2. Example 2
    vector<string> stooges{"Larry", "Moe", "Curly"};

    // str is a copy, so changing it doesn't change the vector
    for (auto str : stooges) str = "Funny";

    // No change in the actuall array
    for (const auto& str: stooges) cout << str << endl;

    // str is a reference, so changes affect the vector
    for (auto& str : stooges) str = "Funny";

    // Read each element without copying or modifying it
    for (const auto& str : stooges) cout << str << endl;  // Funny, Funny, Funny

    // A const reference cannot be used to modify an element
    //for (const auto& str : stooges) str = "Funny";  // Compiler error
}