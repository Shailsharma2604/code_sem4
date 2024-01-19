#include<iostream>
using namespace std;

void display(int n)
{
    if(n<1){return;}
    else
    {
        cout<<n;
        display(n-1);
        cout<<n;
    }
}
int main(){
    int n=113;
    display(113);
}