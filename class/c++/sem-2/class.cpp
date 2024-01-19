#include <iostream>
#include<fstream>
using namespace std;

// int main() {
//     int n;
//     cin>>n;
//     int sum=0;
//     for(int counter=1;counter<=n;counter++){
//         sum+=counter;
//     }
//     cout<<sum<<endl;
//     return 0;
// }

// int main(){
//     int n;
//     cin>>n;
//     while(n>0){
//         cout<<n<<endl;
//         cin>>n;
//     }
//     return 0;
// }

// int main(){
//     int n;
//     cin>>n;
//     do{
//         cout<<n<<endl;
//         cin>>n;
//     }while(n>0);
//     return 0;
// }


// int main(){
//     for (int i = 1; i <= 40; i++)
//     {
//         /* code */
//         cout<<i<<endl;
//     }
    
//     return 0;
// }

// int main(){
//     int i=1;
//     while(i<=40){
//         cout<<i<<endl;
//         i++;
//     }
//     return 0;
// }

// int main(){
//     int i=1;
//     do{
//         cout<<i<<endl;
//         i++;
//     }while(i<=40);
//     return 0;
// }



// int sum(int a,int b){
//     return a+b;
// }

// int main(){
//     int a,b;
//     sum(4,10);
//     cout<<sum;
//     return 0;

// }


// void swap(int *a,int *b){
//     *a=*a+*b;
//     *b=*a-*b;
//     *a=*a-*b;
// }

// int main(){
//     int a=5,b=10;
//     cout<<a<<" "<<b<<endl;
//     swap(&a,&b);
//     cout<<a<<" "<<b;
// }


// int main(){
    // int a;
    // cout<<"enter your number"<<" ";
    // cin>>a;
    // if (a%2)
    // {
    //     cout<<"The number you entersed i even"<<" "<<a;
    // }

    // else if (a==0)
    // {
    //     cout<<"0";
    // }
    // else
    // {
    //     cout<<"The number is old"<<" "<<a;
    // }
    // int a;
    // a=200;
    // int a[6] = {1, 2, 3};
    // cout << a << " " << &a;
    // int a[3] = {1, 2, 3};
    // cout << *(a + 2);
    // int a[6] = {1, 2, 3};
    // int *b = a;
    // cout << b[2];
    // int a[] = {1, 2, 3, 4, 5};
    // cout << *(a) << " " << *(a + 4);

    // int a[] = {1, 2, 3, 4};
    // int *p = a++;
    // cout << *p << endl;

    //  char ch = 'a';
    //  char* ptr = &ch;
    //  ch++;
    //  cout << *ptr << endl;

    // char b[] = "xyz";
    // char *c = &b[0];
    // cout << c << endl;

    // char b[] = "xyz";
    // char *c = &b[0];
    // c++;
    // cout << c << endl;

    // char s[]= "hello";
    // char *p = s;
    // cout << s[0] << " " << p[0];

// }


// int main(){
//     int a = 100;
//     int *p = &a;
//     int **q = &p;
//     int b = (**q)++;
//     int *r = *q;
//     (*r)++;
//     cout << a << " " << b << endl;
// }

// int f(int x, int *py, int **ppz) {
//     int y, z;
//     **ppz += 1;
//     z = **ppz;
//     *py += 2;
//     y = *py;
//     x += 3;
//     return x + y + z;
// }

// int main(){
//     int p = 5;
//     int const *q = &p;
// }

// void print(int n){
//     if(n < 0){
//         return;
//     }
//     if(n == 0){
//         cout << n << " ";
//         return;
//     }
//     print(n --);
//     cout << n << " ";
// }

// int main() {
//     int num = 3;
//     print(num);
// }

// void num(){
//     int n,num,Num;
//     n=num+Num;

// }



// int main(){
//     int num,Num,n;
//     cout<<"";
//     cout<<n<<endl;
//     cin>>num;
//     cin>>Num;
//     void num(*n);
//     return 0;

// }

// #include<iostream>

// using namespace std;


// int multi(int m, int n){
//     int ans=0;
//     if(n==10){
//         return m;
//         n--;
//     }
//     ans=ans+m;
// }

// int main(){
//     mult(3,4);
// }



// int decide(int sum1, int sum2)
// {
    
//     int a;
//     int x = 5, y = 6;
//     cout<<"Enter 0 or 1"<<endl;
//     cin>>a;
//     switch (a)
//     {
//     case 1:
//         sum1 = x+y;
//         cout<<sum1<<endl<<sum2;
//         break;
    
//     case 2:
//         sum2 = x+y;
//         cout<<sum1<<endl<<sum2;
//         break;
    
//     default:
//         cout<<"None of the above cases";
//     }
// }

// int main()
// {
//     int sum1=0,sum2=0;
//     decide(sum1,sum2);
// }


// int mult(int a,int b){
//     if(b==0){
//         return 0;
//     }
//     return a +mult(a,b-1);
// }

// int main(){
//     int a,b;
//     cin>>a>>b;
//     cout<<mult(a,b);
// }

// int main(){
//     int a,b,c,decide;
    
// }



// class books
// {
//     string Name;
//     string Auther;
//     float Price;

//     public:
//         void set(string,string,float);
//         void show_info();
// };
// void books::set(string Name,string Auther,float Prize)
// {
    
// }

// void books::show_info()
// {
//     cout<<"Nme of the book"<<Name;
// }


// class complex
// {
//     public:
//     double real,img;
//         void set_num(double,double);
//         void get_num();
//         void add_num(complex,complex);
//         void mul_num(complex,complex);
// }num1,num2,num3,num4;
// void complex::set_num(double real, double img);
// {
//     this -> real=real;
//     this -> img=img;
// }
// void complex::get_num();
// {
//     if (img>0)
//     cout<<real<<"+"<<img<<"i"<<endl;
//     else
//     cout<<real<<""<<img<<"i"<<endl;
// }
// void complex::add_num(complex num1,complex num2)
// {
//     real=num1.real + num2.real;
//     img=num1.img + num2.img;
//     get_num();
// }
// void complex::mul_num(complex num1,complex num2)
// {
//     real= (num1.real * num2.real)-(num1.img + num2.img);
//     img= (num1.real * num2.real)+(num1.img + num2.img);
//     get_num();
// }
// int main()
// {
//     num1.set_num(10,5);
//     num2.set_num(13,8);
//     num1.get_num();
//     num2.get_num();
//     num3.add_num(num1,num2);
//     num4.mul_num(num1,num2);
// }








// int main(){
//     int m;
//     cin>>m;
//     int*b=new int(m);
//     for (int i = 0; i < m; i++)
//     {
//         cin>>b[i];
//     }
//     cout<<(int*) b[m];
//     return 0;
// }









// class Array
// {
//     public:
//     int arr[5];
//     void InsertArray();
//     void dispalyArray();
//     void addArray(Array , Array );
// }obj1,obj2,obj3;


// void Array::InsertArray(){
//     for (int i = 0;i<5; i++)
//     {
//         cout<<"Insert "<<i+1<<" element : ";
//         cin>>arr[i];
        
//     }
// }

// void Array::dispalyArray(){
//     for(int i =0;i<5;i++)
//     cout<<arr[i];
// }

// void Array::addArray(Array obj1,Array obj2){
//     int sum;
//     for (int i = 0;i<5; i++)
//     {
//         arr[i]=obj1.arr[i]+obj2.arr[i];
//         cout<<arr[i];
//     }
// }

// int main(){
//     obj1.InsertArray();
//     obj2.InsertArray();
//     obj3.addArray(obj1,obj2);
// }












// class Matrix {
//     private:
//         int rows, columns;
//         int matrix[10][10];
        
//     public:
//         // Default constructor
//         Matrix() {
//             rows = 0;
//             columns = 0;
//             for(int i=0; i<10; i++) {
//                 for(int j=0; j<10; j++) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
        
//         // Parameterized constructor
//         Matrix(int r, int c) {
//             rows = r;
//             columns = c;
//             for(int i=0; i<r; i++) {
//                 for(int j=0; j<c; j++) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
        
//         // Function to input matrix elements
//         void input() {
//             cout<<"Enter matrix elements:"<<endl;
//             for(int i=0; i<rows; i++) {
//                 for(int j=0; j<columns; j++) {
//                     cin>>matrix[i][j];
//                 }
//             }
//         }
        
//         // Function to display matrix elements
//         void display() {
//             for(int i=0; i<rows; i++) {
//                 for(int j=0; j<columns; j++) {
//                     cout<<matrix[i][j]<<" ";
//                 }
//                 cout<<endl;
//             }
//         }
        
//         // Function to add two matrices
//         Matrix add(Matrix m) {
//             Matrix result(rows, columns);
//             for(int i=0; i<rows; i++) {
//                 for(int j=0; j<columns; j++) {
//                     result.matrix[i][j] = matrix[i][j] + m.matrix[i][j];
//                 }
//             }
//             return result;
//         }
        
//         // Function to subtract two matrices
//         Matrix subtract(Matrix m) {
//             Matrix result(rows, columns);
//             for(int i=0; i<rows; i++) {
//                 for(int j=0; j<columns; j++) {
//                     result.matrix[i][j] = matrix[i][j] - m.matrix[i][j];
//                 }
//             }
//             return result;
//         }
        
//         // Function to multiply two matrices
//         Matrix multiply(Matrix m) {
//             Matrix result(rows, m.columns);
//             for(int i=0; i<rows; i++) {
//                 for(int j=0; j<m.columns; j++) {
//                     result.matrix[i][j] = 0;
//                     for(int k=0; k<columns; k++) {
//                         result.matrix[i][j] += matrix[i][k] * m.matrix[k][j];
//                     }
//                 }
//             }
//             return result;
//         }
        
//         // Function to find transpose of the matrix
//         Matrix transpose() {
//             Matrix result(columns, rows);
//             for(int i=0; i<columns; i++) {
//                 for(int j=0; j<rows; j++) {
//                     result.matrix[i][j] = matrix[j][i];
//                 }
//             }
//             return result;
//         }
// };

// int main() {
//     Matrix m1(3, 3), m2(3, 3);
    
//     cout<<"Input matrix 1:"<<endl;
//     m1.input();
    
//     cout<<"Input matrix 2:"<<endl;
//     m2.input();
    
//     Matrix sum = m1.add(m2);
//     Matrix difference = m1.subtract(m2);
//     Matrix product = m1.multiply(m2);
// }















// class Student{
//     public:
//     int m;
//     int *marks;
//     Student(int m)
//     {


//     }
// };
// int main(){
//     int n,m;
//     cin>>n>>m;
//     Student s[n];
//     for(int i=00;i<n;i++)
//         for 
// }








// class shape{
//     int length;
//     int width;
//     void
// }





// class shape{
//     int slide1;
//     int slide2;
//     public:
//         void set_sides(int s1, int s2){
//             slide1=s1;
//             slide2=s2;
//         }
// };
// class rec:public shape{
//     public:
//         int area(){
//             rec r;
//         }
// };





























// \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\








// #include <string>

// class Person {
// public:
//     Person() : name(nullptr) {}
//     ~Person() { delete name; }

//     std::string* name;
// };

// int main() {
//     Person person;
//     person.name = new std::string("John Doe");

//     std::cout << *person.name << std::endl;

//     delete person.name;
//     return 0;
// }


// #include <string>

// class Person {
// public:
//     Person() : name(nullptr) {}
//     virtual ~Person() { delete name; }

//     std::string* name;
// };

// class Student : public Person {
// public:
//     Student() : grade(0) {}
//     int grade;
// };

// int main() {
//     Student student;
//     student.name = new std::string("John Doe");
//     student.grade = 10;

//     Person* person = &student;
//     std::cout << *person->name << std::endl;

//     delete student.name;
//     return 0;
// }



// #include <string>

// class Address {
// public:
//     Address() : street("") {}
//     Address(std::string s) : street(s) {}
//     std::string street;
// };

// class Person {
// public:
//     Person() : address(nullptr) {}
//     virtual ~Person() { delete address; }

//     Address* address;
// };

// int main() {
//     Address* address = new Address("123 Main St");
//     Person person;
//     person.address = address;

//     std::cout << person.address->street << std::endl;

//     delete address;
//     return 0;
// }


// #include <string>

// class Person {
// public:
//     Person() : name(nullptr) {}
//     virtual ~Person() { delete name; }

//     std::string* name;
// };

// int main() {
//     const int numPeople = 3;
//     Person people[numPeople];
//     people[0].name = new std::string("John");
//     people[1].name = new std::string("Jane");
//     people[2].name = new std::string("Bob");

//     for (int i = 0; i < numPeople; i++) {
//         Person* person = &people[i];
//         std::cout << *person->name << std::endl;
//     }

//     delete people[0].name;
//     delete people[1].name;
//     delete people[2].name;
//     return 0;
// }


// #include <string>

// class Address {
// public:
//     Address() : zip(nullptr) {}
//     virtual ~Address() { delete zip; }

//     std::string* zip;
// };

// class Person {
// public:
//     Person() : address(nullptr) {}
//     virtual ~Person() { delete address; }

//     Address* address;
// };

// int main() {
//     Person* person = new Person();
//     person->address = new Address();
//     person->address->zip = new std::string("12345");

//     std::string zipCode = *(person->address->zip);
//     std::cout << "Zip Code: " << zipCode << std::endl;

//     delete person->address->zip;
//     delete person->address;
//     delete person;

//     return 0;
// }








// class numbers{
//     public:
//         int a=0;
//         int b=0;
//         numbers(int a1,int b1): a(a1),b(b1){
//         }
//         numbers(const numbers &n, int b1):a(n.a),b(b1){
//         }
// };

// int main(){
//     numbers n1(3,4);
//     numbers n2(n1,10);
//     // n2=n1;
//     cout<<n2.a<<" "<<n2.b;
// }





// \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\FIREND\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\



// class number1{
//     public:
//         int a=0;
//         int b=0; 
//         number1(int a1,int b1): a(a1),b(b1){
//         }
//         void display(){
//             n.a=20;
//         }
//         friend void function1(numbers n);
// };
// void function1(const numbers &n){
//     n.a=30;
// }
// int main(){
//     numbers a(3,4);
//     function1(a);
//     a.display();
// }



// class Complex
// {
//     double real;
//     double imaginary;
//     public:
//     Complex(double real,double imaginary)
//     {
//         this->real=real;
//         this->imaginary=imaginary;
//     }

//     friend void sub(Complex c1,Complex c2);
//     friend void add(Complex c1,Complex c2);
//     friend void mult(Complex c1,Complex c2);
    
// };

// void sub(Complex c1,Complex c2)
// {
//     //c1.real=c2.real-c3.real;
//     //c1.imaginary=c2.imaginary-c3.imaginary;
//     cout << c1.real-c2.real << " " << c1.imaginary-c2.imaginary <<"i" <<endl;

// }

// void add(Complex c1,Complex c2)
// {
//     // c1.real=c2.real+c3.real;
//     // c1.imaginary=c2.imaginary+c3.imaginary;
//     // cout << c1.real << " " << c1.imaginary << endl;
//     cout << c1.real+c2.real << " " << c1.imaginary+c2.imaginary <<"i" <<endl;

// }

// void mult(Complex c1,Complex c2)
// {
//     // c1.real=c2.real*c3.real;
//     // c1.imaginary=c2.imaginary*c3.imaginary;
//     // cout << c1.real << " " << c1.imaginary << endl;
//     cout << c1.real*c2.real << " " << c1.imaginary*c2.imaginary <<"i" <<endl;

// }



// int main()
// {
//     Complex c1(3,5),c2(2,5);
//     sub(c1,c2);
//     add(c1,c2);
//     mult(c1,c2);
// }














// class rec{
//     double s;
//     double w;
    
// }




// int main(){
//     int rec;
//     cout<<"rec"<<endl;
//     cin>>rec;


// hekki how a you want








// class Employee_3837{
//     protected:
//     string name;
//     string id;
//     double salary;
//     int hour;
//     public:
//     Employee_3837(string a,string b,double c,int d){
//         name=a;
//         id=b;
//         salary=c;
//         hour=d;
//     }
//      virtual double calc_salary()=0;
// };
// class Fulltime: virtual protected Employee_3837{
//     public:
//     string name;
//     string id;
//     int hour;
//     void calc_salary(){
        
        
//     }
// };
// class parttime: virtual protected Employee_3837{
//     public:
//     string name;
//     string id;
//     int hour;
//     void calc_salary(){

//     }
// };
// class consulatant: virtual protected Employee_3837{
//     public:
//     string name;
//     string id;
//     int hour;
//     void calc_salary(){

//     }
// };








// \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\File HEANDLING\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

// int main(){
//     ofstream hello("name.txt");
//     string name="johnson";
//     int a1=128;
//     double a=45.5;
//     double b=46.5;

//     hello<<endl<<a<<endl<<" "<<b<<endl;
//     hello<<name;
//     hello.close();


//     ifstream inFile("name.txt");
//     string name1;
//     double a;
//     double b;
//     inFile>>a>>b;
// }










// \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\BY DEAN SIR\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

int main(){
    int *i,*j;
    i=new int;
    j=new int;
    *i=200;
    *j=300;
    cin>>;
    return 0;
}