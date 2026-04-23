//16. File operations in program


#include<iostream>
#include<fstream>
using namespace std;

int main() {
    string data;

    // 1. Writing to file
    ofstream fout("sample.txt");
    fout << "Hello, this is file handling in C++";
    fout.close();

    // 2. Reading from file
    ifstream fin("sample.txt");
    cout << "Reading from file:\n";

    while(getline(fin, data)) {
        cout << data << endl;
    }
    fin.close();

    // 3. Appending to file
    ofstream fout2("sample.txt", ios::app);
    fout2 << "\nAppending new line.";
    fout2.close();

    cout << "\nData appended successfully";

    return 0;
}