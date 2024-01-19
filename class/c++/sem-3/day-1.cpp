#include <iostream>
using namespace std;

// // // 1 Linear Search

// // int main(){
// //     int s;
// //     cin>>s;
// //     int *arr = new int[s];

// //     for(int i = 0; i<s; i++) {
// //         cin>>arr[i];
// //     }

// //     int num;
// //     cin>>num;
// //     for(int i = 0; i<s; i++) {
// //         if(arr[i] == num) {
// //             cout<<"Index is: "<<i;
// //             return 0;
// //         }

// //         else {
// //             continue;
// //         }
// //     }
// //     return 0;
// // }


// // 2 Binary Search

// int main() {
//     int size;
//     cin>>size;
//     int *arr = new int[size];

//     for(int i = 0; i<size; i++) {
//         cin>>arr[i];
//     }

//     int ele;
//     cin>>ele;

//     if(ele<arr[size/2]) {
//         for(int j = 0; j<size/2; j++) {
//             if(arr[j] == ele) {
//                 cout<<"Index is: "<<j;
//                 return 0;
//             }
//             else {
//                 continue;
//             }
//         }
//     }

//     else {
//         for(int i = size/2; i<size+1; i++) {
//             if(arr[i] == ele) {
//                 cout<<"Index is: "<<i;
//                 return 0;
//             }
//             else {
//                 continue;
//             }
//         }
//     }
// }








class node{
    public:
    int data;
    node* next;

    node(int val){
        data=val;
        next=NULL;
    }
};

void insertAtTail (node* &head,int val){
    node* n=new node(val);
    if(head==NULL){
        head=

    }
    node*temp=head;
    while(temp->next!=NULL){
        temp=temp->next;
    }
    temp->next=n;

}



