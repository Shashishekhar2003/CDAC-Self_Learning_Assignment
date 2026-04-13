//pass Pointers in function
#include<iostream>
using namespace std;

void add()
{
    int a,b;
    int* ptr1;
    int* ptr2;

    ptr1=&a;
    ptr2=&b;
    cout<<"Enter two numbers : "<<endl;
    cin>>*ptr1>>*ptr2;
    cout<<"sum = "<<*ptr1+*ptr2<<endl;
    

}
int main()
{
    add();
}
