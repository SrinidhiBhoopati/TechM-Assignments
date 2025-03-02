// Student class with properties name and rollNumber
var Student1 = /** @class */ (function () {
    // Single implementation of the constructor to handle both cases
    function Student1(name, rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber !== undefined ? rollNumber : null; // Assign rollNumber or null
    }
    // Method to display student details
    Student1.prototype.displayDetails = function () {
        if (this.rollNumber !== null) {
            console.log("Student Name: ".concat(this.name, ", Roll Number: ").concat(this.rollNumber));
        }
        else {
            console.log("Student Name: ".concat(this.name, ", Roll Number: Unknown"));
        }
    };
    return Student1;
}());
// Creating Student objects with different constructors
var student2 = new Student1('Alice', 101); // Name and roll number known
var student3 = new Student1('Bob'); // Only name known, roll number is unknown
// Displaying student details
student2.displayDetails(); // Outputs: Student Name: Alice, Roll Number: 101
student3.displayDetails(); // Outputs: Student Name: Bob, Roll Number: Unknown
