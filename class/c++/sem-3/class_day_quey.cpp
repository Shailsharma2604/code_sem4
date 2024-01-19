#include <iostream>
using namespace std;
#include <stack>
#include <string>

int main(){
    stack <int> s;
    int a;
    cin>>a;
    for(int i = 0; i<=a; i++) {
        s.push(i);
    }

    while(!s.empty()) {
        cout<<s.top();
        s.pop();
    }
}
