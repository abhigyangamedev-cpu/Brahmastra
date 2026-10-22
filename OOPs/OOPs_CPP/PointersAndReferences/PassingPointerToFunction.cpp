#include <iostream>
#include <vector>
using namespace std;

void double_data(int *data) {
    *data *= 2;
}

void swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

void display(vector<string> *v) {
    for (string ele : *v) cout << ele << " ";
    cout << endl;
}

void change(vector<string> *v, int *index) {
    (*v).at(*index) = "Funny";
}

void display(int *array,int sentinel) {
    while (*array != sentinel) {cout << *array++ << " ";}
    cout << endl;
}


int main() {

    // 1. Example on double data
    int data{10};
    int *dataPtr{nullptr};

    // Variation 1
    cout << data << endl;
    double_data(&data);
    cout << data << endl;

    // Variation 2
    dataPtr = &data;
    cout << *dataPtr << endl;
    double_data(dataPtr);
    cout << *dataPtr << endl;

    // 2. Example on swap
    int x{100}, y{200};
    int *xPtr{nullptr}, *yPtr{nullptr};

    // Variation 1
    cout << x << endl;
    cout << y << endl;
    swap(&x, &y);
    cout << x << endl;
    cout << y << endl;

    // Variation 2
    xPtr = &x;
    yPtr = &y;
    cout << *xPtr << endl;
    cout << *yPtr << endl;
    swap(xPtr, yPtr);
    cout << *xPtr << endl;
    cout << *yPtr << endl;

    // 3. Example on displaying elements in arrays and vectors
    // 1
    vector<string> v = {"Abhigyan","Bhavil","Ritesh"};
    display(&v);
    int index{0};

    change(&v,&index);
    display(&v);

    // 2
    int arr[]{1,2,3,4,-1};
    display(arr,-1);
}