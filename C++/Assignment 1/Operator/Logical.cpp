#include<iostream>
using namespace std;

int main()
 {
    int a=10, b=20;
    
    // AND Operator
    
     if (a&&b)
        cout << "Logical AND (a&&b) = True" << endl;
    else
        cout << "Logical AND (a&&b) = False" << endl;
        
    // OR Operator
	 if (a||b)
	    cout << "Logical OR (a||b)  = True" << endl;
	else
	    cout << "Logical OR (a||b)  = False" << endl;
	    
	//NOT Operator
	if (!b)
	    cout << " Logical Not (!b)  = True" << endl;
	else
	    cout <<  "Logical NOT (!b)  = False"  << endl;
	 


    return 0;
}