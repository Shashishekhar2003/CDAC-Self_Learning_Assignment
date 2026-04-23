// 3. Write a program to implement inner class in C++


#include<iostream>
using namespace std;

class Outer {
public:
    int x = 100;

    // Inner class
    class Inner {
    public:
        void display() {
            cout << "Inside Inner Class" << endl;
        }
    };
};

int main() {
    // Creating object of inner class
    Outer::Inner obj;

    obj.display();

    return 0;
}