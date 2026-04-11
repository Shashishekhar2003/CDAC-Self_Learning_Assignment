#include <iostream>
using namespace std;

int main() {
	int a = 9, b = 3;

	// Conditional Operator
	int result = (a > b) ? b : a;
	cout << "The greatest number is " << result;

	return 0;
}