// 8. Implement diamond problem with real life example


#include<iostream>
using namespace std;

// Base class
class Person {
public:
    string name;

    Person() {
        name = "Asit";
    }
};

// Derived class 1
class Employee : virtual public Person {
};

// Derived class 2
class Student : virtual public Person {
};

// Final derived class
class Intern : public Employee, public Student {
public:
    void show() {
        cout << "Name: " << name << endl;
    }
};

int main() {
    Intern i;
    i.show();

    return 0;
}