// 4. Design a hierarchy of computer printers. Use multiple inheritance in your hierarchy.
//  Also use friend functions and classes in your program.


#include<iostream>
using namespace std;

// Base class 1
class Printer {
protected:
    string brand = "HP";
};

// Base class 2
class Scanner {
protected:
    int dpi = 300;
};

// Forward declaration
class Tech;

// Derived class
class AllInOne : public Printer, public Scanner {
private:
    int pages = 50;

public:
    void show() {
        cout << "Brand: " << brand << endl;
        cout << "DPI: " << dpi << endl;
    }

    // friend function
    friend void displayPages(AllInOne);

    // friend class
    friend class Tech;
};

// Friend function
void displayPages(AllInOne obj) {
    cout << "Pages: " << obj.pages << endl;
}

// Friend class
class Tech {
public:
    void access(AllInOne obj) {
        cout << "Tech Access Pages: " << obj.pages << endl;
    }
};

int main() {
    AllInOne a;

    a.show();             // normal function
    displayPages(a);      // friend function

    Tech t;
    t.access(a);          // friend class

    return 0;
}