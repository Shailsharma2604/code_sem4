#include<iostream>
#include<string>
using namespace std;


// class student{
//     string name;
//     public:
    
//     int age;
//     bool gender;

//     student(string s){
//         name=s;
//     }

//     void getName(){
//         cout<<name<<endl;
//     }
//     void printInfo(){

//     }
// };

// int main(){
    // student arr[3];
    // for(int i=0;i<3;i++){
    //     cout<<"NAME=";
    //     cin>>arr[i].name;
    //     cout<<"AGE=";
    //     cin>>arr[i].age;
    //     cout<<"GENDER=";
    //     cin>>arr[i].gender;
        
    // }

    // for(int i=0;i<3;i++){
    //     arr[i].printInfo();
    // }

//     student a("Urvi");
//     a.getName();
//     return 0;
// }

// class Employee{
//     private:
//     int a,b,c;
//     public:
//     int d,e;
//     void setdata(int a,int b,int c);
//     void getdata(){
//         cout<<"the value of a is "<<a<<endl;
//         cout<<"the value of b is "<<b<<endl;
//         cout<<"the value of c is "<<c<<endl;
//         cout<<"the value of d is "<<d<<endl;
//         cout<<"the value of e is "<<e<<endl;
//     }
// };

// void Employee::setdata(int a,int b,int c){
    
// }
// int main(){

//     return 0;
// }




// int sum(int a,int b){
//     cout<<"sum"<<endl;
//     return a+b;
// }

// int sum(int a,int b,int c){
//     cout<<"sum"<<endl;
//     return a+b+c;
// }

// int main(){
//     cout<<sum(4,5);
//     cout<<sum(5,6,7);
//     return 0;
// }

class binary{
    string s;
    public:
    void read (void);
    void chk_bin(void);

};

void binary::read (void){
    cout<<"enter a number"<<endl;
    cin >> s;
}

void binary :: chk_bin(void){
    for(int i=0;i < s.length();i++)
    {
        if(s.at(i)!='0'&& s.at(i)!='1'){
            cout<<"incorrect binary format"<<endl;
            exit(0);
        }
    }
}

int main(){
    binary b;
    b.read();
    b.chk_bin();
}
