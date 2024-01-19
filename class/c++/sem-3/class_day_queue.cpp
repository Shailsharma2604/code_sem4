#include <iostream>
using namespace std;

int queue[100],n=100,front=-1,rear=-1;

void insert(){
    int val;
    if(rear==n-1){
        cout<<"queue overflow";
    }
    else{
        if(front==-1){
            front=0;
            cout<<"insert the element: ";
            cin>>val;
            rear++;
            queue[rear]=val;
        }
    }
}

void del(){
    if(front ==-1|| rear==-1){
        cout<<"queue underflow";
    }
    else{
        cout<<"element deleted";
        front--;
    }
}
int main(){
    
}