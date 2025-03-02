// Student class with properties name and rollNumber
class Student1 {
  name: string;
  rollNumber: number | null;  // rollNumber can be null if it's unknown

  // Constructor signatures (overloading)
  constructor(name: string, rollNumber: number);
  constructor(name: string);

  // Single implementation of the constructor to handle both cases
  constructor(name: string, rollNumber?: number) {
    this.name = name;
    this.rollNumber = rollNumber !== undefined ? rollNumber : null;  // Assign rollNumber or null
  }

  // Method to display student details
  displayDetails(): void {
    if (this.rollNumber !== null) {
      console.log(`Student Name: ${this.name}, Roll Number: ${this.rollNumber}`);
    } else {
      console.log(`Student Name: ${this.name}, Roll Number: Unknown`);
    }
  }
}

// Creating Student objects with different constructors
const student2 = new Student1('Alice', 101);  // Name and roll number known
const student3 = new Student1('Bob');         // Only name known, roll number is unknown

// Displaying student details
student2.displayDetails();  // Outputs: Student Name: Alice, Roll Number: 101
student3.displayDetails();  // Outputs: Student Name: Bob, Roll Number: Unknown
