// 1. Using pointers, write your own functions for the following:
// i. String comparison
// ii. String concatenate
// iii. String copy
// iv. String length
// Note: Do not include in your program and implement Delete operator in your program.

#include<iostream>
using namespace std;

// i. String Length
int mystrlen(char *str) {
    int len = 0;
    while(*str != '\0') {
        len++;
        str++;
    }
    return len;
}

// ii. String Copy
void mystrcpy(char *dest, char *src) {
    while(*src != '\0') {
        *dest = *src;
        dest++;
        src++;
    }
    *dest = '\0';
}

// iii. String Concatenate
void mystrcat(char *dest, char *src) {
    while(*dest != '\0') {
        dest++;
    }

    while(*src != '\0') {
        *dest = *src;
        dest++;
        src++;
    }
    *dest = '\0';
}

// iv. String Compare
int mystrcmp(char *s1, char *s2) {
    while(*s1 != '\0' && *s2 != '\0') {
        if(*s1 != *s2)
            return *s1 - *s2;
        s1++;
        s2++;
    }
    return *s1 - *s2;
}

int main() {
    char str1[100] = "Hello";
    char str2[100] = "World";
    char str3[100];

    cout << "Length: " << mystrlen(str1) << endl;

    mystrcpy(str3, str1);
    cout << "Copy: " << str3 << endl;

    mystrcat(str1, str2);
    cout << "Concatenation: " << str1 << endl;

    int result = mystrcmp(str1, str2);
    if(result == 0)
        cout << "Strings are equal";
    else
        cout << "Strings are not equal";

    return 0;
}