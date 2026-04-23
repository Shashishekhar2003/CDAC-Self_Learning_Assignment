// 6. Implement Abstract classes in your program


#include<iostream>
using namespace std;

// Abstract class
class Shape {
public:
    // pure virtual function
    virtual void draw() = 0;
};

// Derived class 1
class Circle : public Shape {
public:
    void draw() {
        cout << "Drawing Circle" << endl;
    }
};

// Derived class 2
class Square : public Shape {
public:
    void draw() {
        cout << "Drawing Square" << endl;
    }
};

int main() {
    Shape *s;   // pointer of abstract class

    Circle c;
    Square sq;

    s = &c;
    s->draw();

    s = &sq;
    s->draw();

    return 0;
}