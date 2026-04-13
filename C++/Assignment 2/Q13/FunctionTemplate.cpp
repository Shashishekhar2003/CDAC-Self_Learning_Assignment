#include<iostream>
using namespace std;

template <class T>
T getMax(T a, T b) {
    if(a > b)
        return a;
    else
        return b;
}

int main() {
    cout << getMax(10, 20) << endl;       // int
    cout << getMax(3.5, 2.1) << endl;     // float

    return 0;
}