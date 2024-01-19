#include <iostream>
using namespace std;

struct Node{
    int data;
    Node* next;
    Node* prev;
};

class node {
    public:
    Node* head;
};

int main(){
    Node Mylist;

    Node*first = new Node();
    first->data=10;
    first->prev=NULL;
    first->next=NULL;
    Mylist;

}