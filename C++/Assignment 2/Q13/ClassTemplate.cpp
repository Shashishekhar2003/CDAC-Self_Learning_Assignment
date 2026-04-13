#include<iostream>
using namespace std;

template <class T>
class Test {
    T x;

public:
    Test(T a) {
        x = a;
    }

    void display() {
        cout << "Value: " << x << endl;
    }
};

int main() {
    Test<int> t1(10);
    Test<float> t2(5.5);

    t1.display();
    t2.display();

    return 0;
}