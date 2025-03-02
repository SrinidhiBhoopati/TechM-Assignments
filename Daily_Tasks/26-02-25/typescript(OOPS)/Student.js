var Student = /** @class */ (function () {
    function Student(name, studentClass) {
        this.name = name;
        this.studentClass = studentClass;
    }
    Student.prototype.displayDetails = function () {
        console.log("Student Name: ".concat(this.name, ", Class: ").concat(this.studentClass));
    };
    return Student;
}());
var student1 = new Student('John Doe', '10th Grade');
student1.displayDetails();
