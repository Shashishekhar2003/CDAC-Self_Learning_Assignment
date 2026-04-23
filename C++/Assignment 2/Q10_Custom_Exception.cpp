// 14.   Implement Custom exception class 

#include<iostream>
using namespace std;

// Custom Exception Class
class MyException {
public:
    void message() {
        cout << "Error: Division by zero is not allowed!" << endl;
    }
};

int main() {
    int a = 10, b = 0;

    try {
        if(b == 0) {
            throw MyException();   // throw object
        }

        cout << a / b;
    }
    catch(MyException e) {
        e.message();   // handle error
    }

    cout << "Program continues..." << endl;

    return 0;
}