#include<iostream>
#include<string>
using namespace std;

void substring(string s, string output,int i){
    if (i>=s.length())
    {
        cout<<output<<endl;
        return;
    }
    substring(s,output,i+1);
    output=output+s[i];
    substring(s,output,i+1);
    
};

int main(){
    string s="abc";
    string output="";
    int i=0;
    substring(s,output,i);
    return 0;
}