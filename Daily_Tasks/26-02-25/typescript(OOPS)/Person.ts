// Base class Person
class Person {
  name: string;
  age: number;

  constructor(name: string, age: number) {
    this.name = name;
    this.age = age;
  }

  // Method to display person details
  displayPersonDetails(): void {
    console.log(`Name: ${this.name}, Age: ${this.age}`);
  }
}

// Derived class Employee extending Person
class Employee extends Person {
  employeeId: number;

  constructor(name: string, age: number, employeeId: number) {
    super(name, age); // Call the parent class constructor to initialize name and age
    this.employeeId = employeeId; // Initialize the additional property employeeId
  }

  // Method to display employee details
  displayEmployeeDetails(): void {
    console.log(`Name: ${this.name}, Age: ${this.age}, Employee ID: ${this.employeeId}`);
  }
}

// Example usage
const employee1 = new Employee('John Doe', 30, 101);
employee1.displayEmployeeDetails();
