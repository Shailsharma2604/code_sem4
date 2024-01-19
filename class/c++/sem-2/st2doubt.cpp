//////////////////////////////////////////////////////////////2////////////////////////////////////////////////////////////////
//question2

#include <iostream>

using namespace std;

class TemperatureC {
public:
    double celsius;


    TemperatureC() {
        celsius = 0.0;
    }

    TemperatureC(double c) {
        celsius = c;
    }

    operator double() {
        return celsius;
    }

    TemperatureC operator+(double d) {
        return TemperatureC(celsius + d);
    }

    TemperatureC operator-(double d) {
        return TemperatureC(celsius - d);
    }

    void operator+=(double d) {
        celsius += d;
    }

    void operator-=(double d) {
        celsius -= d;
    }
};

class TemperatureF {
private:
    double fahrenheit;

public:
    TemperatureF() {
        fahrenheit = 0.0;
    }

    TemperatureF(double f) {
        fahrenheit = f;
    }

    TemperatureF(TemperatureC C) {
       fahrenheit =  (C.celsius*9/5.0)+32;
    }
    operator double() {
        return fahrenheit;
    }
    operator TemperatureC(){
         return TemperatureC((fahrenheit - 32.0) * 5.0 / 9.0);
    }

    TemperatureF operator+(double d) {
        return TemperatureF(fahrenheit + d);
    }

    TemperatureF operator-(double d) {
        return TemperatureF(fahrenheit - d);
    }

    void operator+=(double d) {
        fahrenheit += d;
    }

    void operator-=(double d) {
        fahrenheit -= d;
    }

    // TemperatureC toCelsius() {
    //     return TemperatureC((fahrenheit - 32.0) * 5.0 / 9.0);
    // }
};

int main() {
    double celsius, fahrenheit;

    // Convert temperature from Celsius to Fahrenheit
    cout << "Enter temperature in Celsius: ";
    cin >> celsius;
    //double celsius=tempC;
    TemperatureC tempC(celsius);
    TemperatureF tempF = tempC;
    cout << "Temperature in Fahrenheit: " << (double)tempF << " degrees Fahrenheit" << endl;

    // Convert temperature from Fahrenheit to Celsius
    cout << "Enter temperature in Fahrenheit: ";
    cin >> fahrenheit;
    TemperatureF tempF2(fahrenheit);
    TemperatureC tempC2 = tempF2;
    cout << "Temperature in Celsius: " << (double)tempC2 << " degrees Celsius" << endl;

    // Perform arithmetic operations with TemperatureC objects
    TemperatureC tempC3(10.5);
    TemperatureC tempC4 = tempC3 + 5.0;
    cout << "Result of addition: " << (double)tempC4 << " degrees Celsius" << endl;
    tempC4 -= 2.0;
    cout << "Result of subtraction: " << (double)tempC4 << " degrees Celsius" << endl;

    // Perform arithmetic operations with TemperatureF objects
    TemperatureF tempF3(32.0);
    TemperatureF tempF4 = tempF3 - 10.0;
    cout << "Result of subtraction: " << (double)tempF4 << " degrees Fahrenheit" << endl;
    tempF4 += 5.0;
    cout << "Result of addition: " << (double)tempF4 << " degrees Fahrenheit" << endl;

    return 0;
}

/////////////////////////////////2/////////////////////////1//////////////////////////////////////////







// //question 1
// // overloading function and friend operation

// #include <iostream>
// using namespace std;


// class MathOperations {
// public:
//     // Addition
//     int add(int a, int b) {
//         return a + b;
//     }

//     double add(double a, double b) {
//         return a + b;
//     }

//     // Subtraction
//     int subtract(int a, int b) {
//         return a - b;
//     }

//     double subtract(double a, double b) {
//         return a - b;
//     }

//     // Multiplication
//     int multiply(int a, int b) {
//         return a * b;
//     }

//     double multiply(double a, double b) {
//         return a * b;
//     }

//     // Friend function to calculate average
//     friend double average(double a, double b);
// };

// double average(double a, double b) {
//     return (a + b) / 2.0;
// }

// int main() {
//     MathOperations math;

//     // Test addition
//     int num1, num2;
//     cout << "Enter two integer numbers: ";
//     cin >> num1 >> num2;
//     int result1 = math.add(num1, num2);
//     cout << "Sum of " << num1 << " and " << num2 << " is: " << result1 <<endl;

//     // Test addition (floating-point)
//     double floatNum1, floatNum2;
//     cout << "Enter two floating-point numbers: ";
//     cin >> floatNum1 >> floatNum2;
//     double result2 = math.add(floatNum1, floatNum2);
//     cout << "Sum of " << floatNum1 << " and " << floatNum2 << " is: " << result2 <<endl;

//     // Test average
//     double avgNum1, avgNum2;
//     cout << "Enter two numbers: ";
//     cin >> avgNum1 >> avgNum2;
//     double avgResult = average(avgNum1, avgNum2);
//     cout << "Average of " << avgNum1 << " and " << avgNum2 << " is: " << avgResult << endl;

//     return 0;
// }




///////////////////////////////////////////////////////////////////4///////////////////////////////////////////////


//question4
// #include <iostream>
// #include <string>

// using namespace std;

// class Employee {
// protected:
//     string name;
//     int employeeID;
//     double baseSalary;

// public:
//     Employee() {
//         name = "";
//         employeeID = 0;
//         baseSalary = 0.0;
//     }

//     Employee(string n, int id, double salary) {
//         name = n;
//         employeeID = id;
//         baseSalary = salary;
//     }

//     void SetName(string n) {
//         name = n;
//     }

//     string GetName() {
//         return name;
//     }

//     void SetEmployeeID(int id) {
//         employeeID = id;
//     }

//     int GetEmployeeID() {
//         return employeeID;
//     }

//     void SetBaseSalary(double salary) {
//         baseSalary = salary;
//     }

//     double GetBaseSalary() {
//         return baseSalary;
//     }

//     virtual double calculateSalary() {
//         return baseSalary;
//     }
// };

// class Manager : public Employee {
// private:
//     double bonus;

// public:
//     Manager() : Employee() {
//         bonus = 0.0;
//     }

//     Manager(string n, int id, double salary, double b) : Employee(n, id, salary) {
//         bonus = b;
//     }

//     void SetBonus(double b) {
//         bonus = b;
//     }

//     double GetBonus() {
//         return bonus;
//     }

//     double calculateSalary() override {
//         return baseSalary + bonus;
//     }
// };

// class Engineer : public Employee {
// private:
//     int overtimeHours;

// public:
//     Engineer() : Employee() {
//         overtimeHours = 0;
//     }

//     Engineer(string n, int id, double salary, int hours) : Employee(n, id, salary) {
//         overtimeHours = hours;
//     }

//     void SetOvertimeHours(int hours) {
//         overtimeHours = hours;
//     }

//     int GetOvertimeHours() {
//         return overtimeHours;
//     }

//     double calculateSalary() override {
//         const double overtimeRate = 100.0;
//         double overtimePay = overtimeHours * overtimeRate;
//         return baseSalary + overtimePay;
//     }
// };

// int main() {
//     Manager manager;
//     string managerName;
//     int managerID;
//     double managerBaseSalary, managerBonus;

//     cout << "Enter the name of the manager: ";
//     getline(cin, managerName);
//     manager.SetName(managerName);

//     cout << "Enter the employee ID of the manager: ";
//     cin >> managerID;
//     manager.SetEmployeeID(managerID);

//     cout << "Enter the base salary of the manager: ";
//     cin >> managerBaseSalary;
//     manager.SetBaseSalary(managerBaseSalary);

//     cout << "Enter the bonus amount for the manager: ";
//     cin >> managerBonus;
//     manager.SetBonus(managerBonus);

//     cout << "Manager:" << endl;
//     cout << "Name: " << manager.GetName() << endl;
//     cout << "Employee ID: " << manager.GetEmployeeID() << endl;
//     cout << "Base Salary: " << manager.GetBaseSalary() << endl;
//     cout << "Bonus: " << manager.GetBonus() << endl;
//     cout << "Salary: " << manager.calculateSalary() << endl;

//     Engineer engineer;
//     string engineerName;
//     int engineerID, overtimeHours;
//     double engineerBaseSalary;

//     cin.ignore(); // Ignore the newline character left by previous cin

//     cout << "\nEnter the name of the engineer: ";
//     getline(cin, engineerName);
//     engineer.SetName(engineerName);

//     cout << "Enter the employee ID of the engineer: ";
//     cin >> engineerID;
//     engineer.SetEmployeeID(engineerID);

// cout << "Enter the base salary of the engineer: ";
// cin >> engineerBaseSalary;
// engineer.SetBaseSalary(engineerBaseSalary);

// cout << "Enter the number of overtime hours for the engineer: ";
// cin >> overtimeHours;
// engineer.SetOvertimeHours(overtimeHours);

// cout << "\nEngineer:" << endl;
// cout << "Name: " << engineer.GetName() << endl;
// cout << "Employee ID: " << engineer.GetEmployeeID() << endl;
// cout << "Base Salary: " << engineer.GetBaseSalary() << endl;
// cout << "Overtime Hours: " << engineer.GetOvertimeHours() << endl;
// cout << "Salary: " << engineer.calculateSalary() << endl;

// return 0;
// }




///////////////////////////////////////////////////////////////////5///////////////////////////////////////////////////////////





//question5

// #include <iostream>
// #include <string>
// #include <cmath>

// using namespace std;

// class Vehicle {
// protected:
//     string brand;
//     string model;

// public:
//     Vehicle() : brand(""), model("") {}
//     Vehicle(string brand, string model) : brand(brand), model(model) {}

//     void SetBrand(string brand) {
//         this->brand = brand;
//     }

//     string GetBrand() {
//         return brand;
//     }

//     void SetModel(string model) {
//         this->model = model;
//     }

//     string GetModel() {
//         return model;
//     }

//     virtual double CalculateMaxSpeed() = 0;
// };

// class Car : public Vehicle {
// private:
//     int horsepower;

// public:
//     Car() : horsepower(0) {}
//     Car(string brand, string model, int horsepower) : Vehicle(brand, model), horsepower(horsepower) {}

//     double CalculateMaxSpeed() {
//         return horsepower * 2;
//     }
// };

// class Motorcycle : public Vehicle {
// private:
//     int cc;

// public:
//     Motorcycle() : cc(0) {}
//     Motorcycle(string brand, string model, int cc) : Vehicle(brand, model), cc(cc) {}

//     double CalculateMaxSpeed() {
//         return sqrt(cc) * 100;
//     }
// };

// int main() {
//     string carBrand, carModel;
//     int carHorsepower;

//     cout << "Enter Car Brand: ";
//     getline(cin, carBrand);

//     cout << "Enter Car Model: ";
//     getline(cin, carModel);

//     cout << "Enter Car Horsepower: ";
//     cin >> carHorsepower;
//     cin.ignore(); // Ignore the newline character

//     Car car(carBrand, carModel, carHorsepower);

//     cout << "Car:" << endl;
//     cout << "Brand: " << car.GetBrand() << endl;
//     cout << "Model: " << car.GetModel() << endl;
//     cout << "Horsepower: " <<carHorsepower << endl;
//     cout << "Maximum Speed: " << car.CalculateMaxSpeed() << endl;

//     cout << endl;

//     string motorcycleBrand, motorcycleModel;
//     int motorcycleCC;

//     cout << "Enter Motorcycle Brand: ";
//     getline(cin, motorcycleBrand);

//     cout << "Enter Motorcycle Model: ";
//     getline(cin, motorcycleModel);

//     cout << "Enter Motorcycle Engine Displacement (cc): ";
//     cin >> motorcycleCC;
//     cin.ignore(); // Ignore the newline character

//     Motorcycle motorcycle(motorcycleBrand, motorcycleModel, motorcycleCC);

//     cout << "Motorcycle:" << endl;
//     cout << "Brand: " << motorcycle.GetBrand() << endl;
//     cout << "Model: " << motorcycle.GetModel() << endl;
//     cout << "Engine Displacement (cc): " << motorcycleCC<< endl;
//     cout << "Maximum Speed: " << motorcycle.CalculateMaxSpeed() << endl;

//     return 0;
// }





/////////////////////////////////////////////////////////3/////////////////////////////////////////////////////////////




// //question3
// #include <iostream>
// #include <string>
// #include <cmath>
// using namespace std;

// class Shape {
// public:
//     string name;
//     double area;
//     Shape() : name(""), area(0.0) {}
//     Shape(string n) : name(n), area(0.0) {}

//     void SetName(string n) {
//         name = n;
//     }

//     string GetName() {
//         return name;
//     }

//     virtual void CalculateArea() {
//         // No implementation in the base class
//     }

//     double GetArea() {
//         return area;
//     }
// };

// class Rectangle : public Shape {
// public:
//     double length;
//     double width;


//     Rectangle() : length(0.0), width(0.0) {}
//     Rectangle(double l, double w) : length(l), width(w) {}

//     void CalculateArea() override {
//         area = length * width;
//     }

//     void SetDimensions(double l, double w) {
//         length = l;
//         width = w;
//     }
// };

// class Circle : public Shape {
// public:
//     double radius;
//     Circle() : radius(0.0) {}
//     Circle(double r) : radius(r) {}

//     void CalculateArea() override {
//         area = M_PI * radius * radius;
//     }

//     void SetRadius(double r) {
//         radius = r;
//     }
// };

// int main() {
//     Rectangle rect;
//     rect.SetName("Rectangle");

//     double length, width;
//     cout << "Enter the length of the rectangle: ";
//     cin >> length;
//     cout << "Enter the width of the rectangle: ";
//     cin >> width;

//     rect.SetDimensions(length, width);
//     rect.CalculateArea();

//     cout << "\nRectangle:" <<endl;
//     cout << "Name: " << rect.GetName() <<endl;
//     cout << "Area: " << rect.GetArea() <<endl;

//     Circle circle;
//     circle.SetName("Circle");

//     double radius;
//     cout << "\nEnter the radius of the circle: ";
//     cin >> radius;

//     circle.SetRadius(radius);
//     circle.CalculateArea();

//     cout << "\nCircle:" << endl;
//     cout << "Name: " << circle.GetName() <<endl;
//     cout << "Area: " << circle.GetArea() <<endl;

//     return 0;
// }




/////////////////////////////////////////////////7///////////////////////////////////////////////////////////////




//question 7
// #include <iostream>
// #include <fstream>
// #include <string>
// using namespace std;

// int main() {
//     string fileName;
//     cout << "Enter the name of the input file: ";
//     cin >> fileName;

//     ifstream inputFile(fileName);

//     if (!inputFile) {
//         cerr << "Error opening file: " << fileName << endl;
//         return 1;
//     }

//     int charCount = 0;
//     int wordCount = 0;
//     int lineCount = 0;
//     string line;

//     while (getline(inputFile, line)) {
//         lineCount++;
//         charCount += line.size();

//         bool insideWord = false;
//         for (char c : line) {
//             if (c == ' ' || c == '\t' || c == '\n') {
//                 insideWord = false;
//             } else if (!insideWord) {
//                 insideWord = true;
//                 wordCount++;
//             }
//         }
//     }

//     inputFile.close();

//     cout << "File analysis results:" << endl;
//     cout << "Total characters: " << charCount << endl;
//     cout << "Total words: " << wordCount << endl;
//     cout << "Total lines: " << lineCount <<endl;

//     return 0;
// }



//////////////////////////////////8////////////////////////////////////////////////////////////////////////////



// //question 8
// #include <iostream>
// #include <fstream>

// class Time {
// public:
//     int hours;
//     int minutes;
//     int seconds;


//     Time() : hours(0), minutes(0), seconds(0) {}

//     void setTime(int h, int m, int s) {
//         hours = h;
//         minutes = m;
//         seconds = s;
//     }

//     void printTime() const {
//         std::cout << "Time: " << hours << ":" << minutes << ":" << seconds << std::endl;
//     }
// };

// int main() {
//     int hours, minutes, seconds;

//     // Prompt user for time input
//     std::cout << "Enter the time (hours minutes seconds): ";
//     std::cin >> hours >> minutes >> seconds;

//     // Create Time object and set its values
//     Time time;
//     time.setTime(hours, minutes, seconds);

//     // Open binary file for writing
//     std::ofstream outputFile("time_data.bin", std::ios::binary);
//     if (!outputFile) {
//         std::cerr << "Error opening the file for writing." << std::endl;
//         return 1;
//     }

//     // Write data to binary file
//     outputFile.write(reinterpret_cast<char*>(&time), sizeof(Time));

//     // Close the binary file after writing
//     outputFile.close();
//     std::cout << "Data successfully written to the binary file." << std::endl;

//     // Open binary file for reading
//     std::ifstream inputFile("time_data.bin", std::ios::binary);
//     if (!inputFile) {
//         std::cerr << "Error opening the file for reading." << std::endl;
//         return 1;
//     }

//     // Read data from binary file into a new Time object
//     Time newTime;
//     inputFile.read(reinterpret_cast<char*>(&newTime), sizeof(Time));

//     // Close the binary file after reading
//     inputFile.close();
//     std::cout << "Binary file read successfully." << std::endl;

//     // Display the time in human-readable format
//     newTime.printTime();

//     return 0;
//  }





/////////////////////////////////////////////////////////////////////////////////////////////////////




// #include <iostream>
// #include <iomanip>
// #include <cmath>
// using namespace std;

// // Custom manipulator function to calculate and format the area of a circle
// istream& calculateArea(istream& istd) {
//     // Retrieve the radius from the stream buffer
//     double radius;
//     istd >> radius;

//     // Calculate the area of the circle
//     double area = M_PI * radius * radius;

//     // Format the area with two decimal places
//     cout << fixed << setprecision(2);

//     // Display the area with appropriate formatting
//     cout << "The area of the circle with radius " << radius << " is " << area << " square units.";

//     return istd;
// }

// int main() {
//     cout << "Enter the radius of the circle: ";

//     // Apply the custom manipulator to calculate and format the area
//     cin >> calculateArea;
//     cout << endl;

//     return 0;
// }