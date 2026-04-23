
// 2. Implement constructor and destructors through your program

#include<iostream>
using namespace std;

class Demo {
public:
    int x;

    // Constructor
    Demo() {
        x = 10;
        cout << "Constructor Called, x = " << x << endl;
    }

    // Destructor
    ~Demo() {
        cout << "Destructor Called" << endl;
    }
};

int main() {
    Demo obj;   // Constructor is called

    return 0;   // Destructor is called automatically
}