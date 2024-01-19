// #include <iostream>
// using namespace std;
// int main() {
//     int s1, s2;
//     cin>>s1>>s2;
//     int arr[s1][s2] = {};
//     for(int i = 0; i<s1; i++) {
//         for(int j = 0; j<s2; j++) {
//             cin>>arr[i][j];
//         }
//     }
//     cout<<endl;
//     for(int i = 0; i<s1; i++) {
//         for(int j = 0; j<s2; j++) {
//             cout<<arr[i][j]<<" ";
//         }
//         cout<<endl;
//     }
//     cout<<endl;
//     for(int i = 0; i<s1; i++) {
//         for(int j = 0; j<s2; j++) {
//             if(arr[i][j] != 0) {
//                 cout<<i<<" "<<j<<" "<<arr[i][j]<<endl;
//             }
//             else {
//                 continue;
//             }
//         }
//     }
// }

#include <iostream>
using namespace std; 
int main() {
    int size;
    cin>>size;
    int *arr = new int[size];

    for(int i = 0; i<size; i++) {
        cin>>arr[i];
    }

    for(int k = 0; k<size; k++) {  
        for(int i = 0, j = i+1; j<size-k; i++, j++) {

            if(arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            else{
                continue;
            }
        }
    }
    
    for(int i = 0; i<size; i++) {
        cout<<arr[i]<<" ";
    }    

}
