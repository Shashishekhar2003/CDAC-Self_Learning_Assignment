// 13.  Implement exceptions and do proper management through your program


#include<iostream>
using namespace std;

int main() {
    int a, b;

    cout << "Enter two numbers: ";
    cin >> a >> b;

    try {
        if(b == 0) {
            throw b;   // throw exception
        }

        cout << "Division: " << a / b << endl;
    }
    catch(int x) {
        cout << "Error: Division by zero not allowed" << endl;
    }

    cout << "Program continues..." << endl;

    return 0;
}