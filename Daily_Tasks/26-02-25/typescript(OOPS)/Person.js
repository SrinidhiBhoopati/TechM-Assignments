var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
// Base class Person
var Person = /** @class */ (function () {
    function Person(name, age) {
        this.name = name;
        this.age = age;
    }
    // Method to display person details
    Person.prototype.displayPersonDetails = function () {
        console.log("Name: ".concat(this.name, ", Age: ").concat(this.age));
    };
    return Person;
}());
// Derived class Employee extending Person
var Employee = /** @class */ (function (_super) {
    __extends(Employee, _super);
    function Employee(name, age, employeeId) {
        var _this = _super.call(this, name, age) || this; // Call the parent class constructor to initialize name and age
        _this.employeeId = employeeId; // Initialize the additional property employeeId
        return _this;
    }
    // Method to display employee details
    Employee.prototype.displayEmployeeDetails = function () {
        console.log("Name: ".concat(this.name, ", Age: ").concat(this.age, ", Employee ID: ").concat(this.employeeId));
    };
    return Employee;
}(Person));
// Example usage
var employee1 = new Employee('John Doe', 30, 101);
employee1.displayEmployeeDetails();
