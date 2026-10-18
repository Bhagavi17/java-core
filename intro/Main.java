// public class Main {
//     static int num1 = 10;
//     static int num2 = 20;

//     public static void main(String[] args) {
//         System.out.println("Hello World");

//         System.out.println(num1 + num2);
//         System.out.println(num1 - num2);
//         System.out.println(num1 * num2);
//         System.out.println(num1 / num2);
//         System.out.println(num1 % num2);

//           System.out.println(num1 >num2);
//         System.out.println(num1 >= num2);
//         System.out.println(num1 < num2);
//         System.out.println(num1 == num2);
//         System.out.println(num1 !=num2);
//     }
// }
// //DEV ==> JAVA CODE ==> Compiler(javac) => 
// class Employee {
//     String name;
//     double salary;

//     // Parameterized constructor
//     Employee(String name, double salary) {
//         this.name = name;
//         this.salary = salary;
//         System.out.println("Constructor Called...");
//     }

//     // Copy constructor
//     Employee(Employee emp) {
//         this.name = emp.name;
//         this.salary = emp.salary;
//         System.out.println("Copy Constructor Called...");
//     }

//     // Display employee details
//     void details() {
//         System.out.println("Name: " + name + ", Salary: " + salary);
//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         Employee emp1 = new Employee("Bhagavi", 50000);

//         emp1.details();

//         Employee emp2 = new Employee(emp1);

//         emp2.details();
//     }
// }

// public class Main {

//     static void countdown(int n) {
//         if (n == 0) { // base case
//             System.out.println("Done!");
//         } else {
//             countdown(n - 1); // recursive call output : 1 2 3 4 5 
//             System.out.println(n);
//            // countdown(n - 1); // recursive call output:5 4 3 2 1 
//         }
//     }

//     public static void main(String[] args) {
//         countdown(5);
//     }
// }
