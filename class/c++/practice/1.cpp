#include <iostream>
using namespace std;

class node{
    public:
    int data;
    node* next;
    node(int data){
         this->data=data;
         this->next=NULL;
    }
};

int main(){
    node* Node1= new node(10);
    cout<<Node1 -> data<<endl;
    cout<<Node1 -> next<<endl;

}