// 15.   Implement console I/O operations through your program.

#include<iostream>
using namespace std;

int main() {
    int age;
    float salary;
    string name;

    cout << "Enter name: ";
    cin >> name;

    cout << "Enter age: ";
    cin >> age;

    cout << "Enter salary: ";
    cin >> salary;

    cout << "\n--- Output ---\n";
    cout << "Name: " << name << endl;
    cout << "Age: " << age << endl;
    cout << "Salary: " << salary << endl;

    return 0;
}