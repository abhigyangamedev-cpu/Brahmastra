#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main () {

    // 1. Integer
    int score{100};
    int *scorePtr{&score};

    cout << *scorePtr << endl;

    *scorePtr = 200;
    cout << *scorePtr << endl;

    // 2. Double
    double high_temp{118.9};
    double low_temp{11.9};
    double *temp_ptr{&high_temp};

    cout << *temp_ptr << endl;

    temp_ptr = &low_temp;
    cout << *temp_ptr << endl;

    // 3. String
    string name{"Abhigyan"};
    string *namePtr{&name};

    cout << *namePtr << endl;

    name = "James";
    cout << *namePtr << endl;

    // 4. Vector
    vector<int> vec{1, 2, 3};
    vector<int> *vecPtr{&vec};

    cout << "First Element :- " << (*vecPtr).at(0) << endl;
    cout << "Printing all the elements in the vector" << endl;
    for (auto ele : *vecPtr) cout << ele << " ";
    cout << endl;

}
