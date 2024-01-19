#include <iostream>
using namespace std;







///////////////////////////////////////////////////////////////////Linkedlist///////////////////////////////////////////////////////////////////////////


// struct Linklist{
//     int data;
//     struct Linklist* next;
// };

// Linklist* insert_beg(Linklist* head,int data){
//     Linklist* temp;
//     temp=new Linklist;
//     temp->data=data;
//     temp->next=NULL;
//     if(head==NULL){
//         head=temp;
//     }
//     else{
//         temp->next=head;
//         head=temp;
//     }
//     return head;
// }

// void dis(Linklist* head){
//     Linklist*temp;
//     temp=head;
//     while(temp!=NULL){
//         cout<<temp->data<<" ";
//         temp=temp->next;
//     }
// cout<<endl;
// }

// int main(){
//     // Linklist ob;
//     Linklist*head=NULL;
//     head = insert_beg(head,10);
//     head = insert_beg(head,20);
//     head = insert_beg(head,30);
//     dis(head);
// }




struct Linklist {
    int data;
    struct Linklist* next;
};
Linklist* insert_beg(Linklist* head, int data) {
    Linklist* temp = new Linklist;
    temp->data = data;
    temp->next = NULL;
    if (head == NULL) {
        head = temp;
    }
    else {
        temp->next = head;
        head = temp;
    }
    return head;
}
Linklist* delete_beg(Linklist* head) {
    if (head == NULL) {
        cout << "List is empty, cannot delete." << endl;
    }
    else {
        Linklist* temp = head;
        head = head->next;
        delete temp;
    }
    return head;
}
void dis(Linklist* head) {
    Linklist* temp = head;
    while (temp != NULL) {
        cout << temp->data << " ";
        temp = temp->next;
    }
    cout << endl;
}
int main() {
    Linklist* head = NULL;
    head = insert_beg(head, 10);
    head = insert_beg(head, 20);
    head = insert_beg(head, 30);
    cout << "Original List: ";
    dis(head);
    head = delete_beg(head);
    cout << "List after deletion: ";
    dis(head);
    return 0;
}
  