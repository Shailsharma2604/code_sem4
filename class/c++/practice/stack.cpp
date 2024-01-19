#include<iostream>
#include<stack>
using namespace std;


int main(){
    int a,b;
    cin>>a>>b;
    stack<int>s;
    s.push(a);
    s.push(b);
    s.pop();
    if(s.empty()){
        cout<<"stack is empty"<<s.top()<<endl;
    }
    else{
        cout<<"stack is not empty "<<endl;
        cout<<"the elemnt present is 4"<<s.top()<<endl;
    }
    cout<<"size of stack is "<<s.size()<<endl;

}