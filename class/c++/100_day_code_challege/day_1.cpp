#include <iostream>
#include<fstream>
#include <string>
using namespace std;
int main(){
    int a,b,n,m;
    string c,d;
    cout<<"how many number you want";
    cin>>m;
    while (m==4)
    {
        cout << "enter your number:";
        cin>>a;
        // cout << "number = " << a << endl;
        cout << "enter your number:";
        cin>>b;
        break;
    }
    cout << "enter your sumbol for the operation:";
    cin>>c;
    // cout << "number = " << c << endl;
    if (c == "+")
    {
        d=a+b;
        cout <<"Your answer for the operation:"<< a+b << endl;
    }
    
}