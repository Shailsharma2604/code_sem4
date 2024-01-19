#include <iostream>
using namespace std;

int stack[100];
int size;
int top=-1;

void push(int val){
    if(top>=size-1){
        cout<<"stack is full";
    }
    else{
        top=top+1;
        stack[top]=val;
    }
}

void display(){
    if (top>=0){
        cout<<"the elements are";
        for(int i= top;i>=0;i--){
            cout<<stack[i];
        }
    }
    else{
        cout<<"stack empty";
    }
}

void pop() {
    if(top<=-1) {
        cout<<"No element";
    }
    else {
        cout<<"element is: "<<stack[top];
        top--;    
    }
}

int main() {
    while(1) {
        int val;
        int choice;
        cout<<endl<<"1. Push"<<endl<<"2. Pop"<<endl<<"3. Display"<<endl<<"4. Exit"<<endl;;
        cout<<"Enter the choice: ";
        cin>>choice;

        switch(choice) {

            case 1:
            cout<<"Enter value to push: ";
            cin>>val;
            push(val);
            break;

            case 2:
            pop();
            break;

            case 3:
            display();
            break;

            case 4:
            cout<<"EXITING"<<endl;
            exit(0);
            
            default:
            cout<<"Invalid";
        }
    }
    return 0;
}