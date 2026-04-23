// 5. Write Date and Time classes that allow you to add, subtract,
//  read and print simple dates in dd/mm/yyyy and time in hh:mm:ss formats.
//  Use function overloading in your program.


#include<iostream>
using namespace std;

// Date Class
class Date {
public:
    int d, m, y;

    void read() {
        cin >> d >> m >> y;
    }

    void print() {
        cout << d << "/" << m << "/" << y << endl;
    }

    // Add days
    void operate(int days) {
        d += days;
    }

    // Subtract days
    void operate(int days, int flag) {
        d -= days;
    }
};

// Time Class
class Time {
public:
    int h, m, s;

    void read() {
        cin >> h >> m >> s;
    }

    void print() {
        cout << h << ":" << m << ":" << s << endl;
    }

    // Add seconds
    void operate(int sec) {
        s += sec;
    }

    // Subtract seconds
    void operate(int sec, int flag) {
        s -= sec;
    }
};

int main() {
    Date d;
    Time t;

    cout << "Enter Date (dd mm yyyy): ";
    d.read();

    cout << "Enter Time (hh mm ss): ";
    t.read();

    cout << "Original Date: ";
    d.print();

    cout << "Original Time: ";
    t.print();

    // Add
    d.operate(5);      // add 5 days
    t.operate(30);     // add 30 sec

    cout << "After Addition:\n";
    d.print();
    t.print();

    // Subtract
    d.operate(2, 1);   // subtract 2 days
    t.operate(10, 1);  // subtract 10 sec

    cout << "After Subtraction:\n";
    d.print();
    t.print();

    return 0;
}