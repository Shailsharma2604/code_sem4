// ..............................1.......................................

// import java.util.Scanner;

// public class Problem_Statements {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();
//         if (isEven(number)) {
//             System.out.println(number + " is an even number.");
//         } else {
//             System.out.println(number + " is an odd number.");
//         }
//         scanner.close();
//     }
//     private static boolean isEven(int num) {
//         return num % 2 == 0;
//     }
// }


// ..............................2.......................................

// import java.util.Scanner;

// public class Problem_Statements {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a year: ");
//         int year = scanner.nextInt();
//         if (isLeapYear(year)) {
//             System.out.println(year + " is a leap year.");
//         } else {
//             System.out.println(year + " is not a leap year.");
//         }
//         scanner.close();
//     }
//     private static boolean isLeapYear(int year) {
//         return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
//     }
// }


// ..............................3.......................................

// import java.util.Scanner;

// public class Problem_Statements {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         double num1 = scanner.nextDouble();
//         System.out.print("Enter the second number: ");
//         double num2 = scanner.nextDouble();
//         System.out.println("Select an operation:");
//         System.out.println("1. Addition (+)");
//         System.out.println("2. Subtraction (-)");
//         System.out.println("3. Multiplication (*)");
//         System.out.println("4. Division (/)");
//         System.out.print("Enter the operation (1-4): ");
//         int choice = scanner.nextInt();
//         switch (choice) {
//             case 1:
//                 System.out.println("Result: " + (num1 + num2));
//                 break;
//             case 2:
//                 System.out.println("Result: " + (num1 - num2));
//                 break;
//             case 3:
//                 System.out.println("Result: " + (num1 * num2));
//                 break;
//             case 4:
//                 if (num2 != 0) {
//                     System.out.println("Result: " + (num1 / num2));
//                 } else {
//                     System.out.println("Error: Cannot divide by zero.");
//                 }
//                 break;
//             default:
//                 System.out.println("Invalid choice. Please enter a number between 1 and 4.");
//         }
//         scanner.close();
//     }
// }



// ..............................4.......................................


// import java.util.Scanner;

// public class Problem_Statements {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the limit for the Fibonacci series: ");
//         int limit = scanner.nextInt();
//         System.out.println("Fibonacci series up to " + limit + ":");
//         printFibonacciSeries(limit);
//         scanner.close();
//     }
//     private static void printFibonacciSeries(int limit) {
//         int num1 = 0, num2 = 1, nextTerm;
//         System.out.print(num1 + " " + num2 + " ");
//         for (int i = 2; i < limit; i++) {
//             nextTerm = num1 + num2;
//             System.out.print(nextTerm + " ");
//             num1 = num2;
//             num2 = nextTerm;
//         }
//     }
// }

// ..............................5.......................................

// import java.util.Scanner;

// public class Problem_Statements {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number to find its factorial: ");
//         int number = scanner.nextInt();
//         long factorial = calculateFactorial(number);
//         System.out.println("Factorial of " + number + " is: " + factorial);
//         scanner.close();
//     }
//     private static long calculateFactorial(int n) {
//         if (n < 0) {
//             return -1;
//         }
//         long result = 1;
//         for (int i = 1; i <= n; i++) {
//             result *= i;
//         }
//         return result;
//     }
// }



// ..............................6.......................................

// import java.util.Scanner;

// public class Problem_Statements {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number for the multiplication table: ");
//         int number = scanner.nextInt();
//         System.out.println("Multiplication table for " + number + ":");
//         printMultiplicationTable(number);
//         scanner.close();
//     }
//     private static void printMultiplicationTable(int n) {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(n + " x " + i + " = " + (n * i));
//         }
//     }
// }


// ..............................7.......................................

// import java.util.Scanner;

// public class Problem_Statements {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of rows: ");
//         int rows = scanner.nextInt();
//         System.out.print("Enter the number of columns: ");
//         int columns = scanner.nextInt();
//         System.out.println("Hollow Rectangle Pattern:");
//         printHollowRectangle(rows, columns);
//         scanner.close();
//     }
//     private static void printHollowRectangle(int rows, int columns) {
//         for (int i = 1; i <= rows; i++) {
//             for (int j = 1; j <= columns; j++) {
//                 if (i == 1 || i == rows || j == 1 || j == columns) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// ..............................8.......................................


// import java.util.Scanner;

// public class Problem_Statements {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of rows for Pascal's Triangle: ");
//         int numRows = scanner.nextInt();
//         System.out.println("Pascal's Triangle:");
//         printPascalsTriangle(numRows);
//         scanner.close();
//     }
//     private static void printPascalsTriangle(int numRows) {
//         for (int i = 0; i < numRows; i++) {
//             int number = 1;
//             for (int j = 0; j < numRows - i; j++) {
//                 System.out.print("   ");
//             }
//             for (int j = 0; j <= i; j++) {
//                 System.out.printf("%6d", number);
//                 number = number * (i - j) / (j + 1);
//             }
//             System.out.println();
//         }
//     }
// }

// ..............................9.......................................

// import java.util.Scanner;

// public class Problem_Statements {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         int num1 = scanner.nextInt();
//         System.out.print("Enter the second number: ");
//         int num2 = scanner.nextInt();
//         int sum = num1 + num2;
//         System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
//         scanner.close();
//     }
// }

// ..............................10.......................................

 import java.util.Scanner;

public class Problem_Statements {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide exactly three arguments: num1, operator, num2");
            return;
        }
        try {
            double num1 = Double.parseDouble(args[0]);
            String operator = args[1];
            double num2 = Double.parseDouble(args[2]);
            double result = calculateResult(num1, operator, num2);
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format. Please provide valid numbers.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    private static double calculateResult(double num1, String operator, double num2) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new IllegalArgumentException("Cannot divide by zero.");
                }
            default:
                throw new IllegalArgumentException("Invalid operator. Supported operators: +, -, *, /");
        }
    }
}
