// Engine class with properties horsepower and fuelType
var Engine = /** @class */ (function () {
    function Engine(horsepower, fuelType) {
        this.horsepower = horsepower;
        this.fuelType = fuelType;
    }
    return Engine;
}());
// Base class: Car
var Car1 = /** @class */ (function () {
    function Car1(make, model, year, engine) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.engine = engine; // Initialize engine property
    }
    // Method to start the car
    Car1.prototype.start = function () {
        console.log("".concat(this.year, " ").concat(this.make, " ").concat(this.model, " is starting..."));
    };
    // Method to print car and engine details
    Car1.prototype.printCarDetails = function () {
        console.log("Car Details: ".concat(this.year, " ").concat(this.make, " ").concat(this.model));
        console.log("Engine Details: ".concat(this.engine.horsepower, " HP, ").concat(this.engine.fuelType, " engine"));
    };
    return Car1;
}());
// Creating an instance of the Engine class
var myEngine = new Engine(300, 'Petrol');
// Creating a Car object with an Engine instance
var myCar = new Car1('BMW', 'X5', 2022, myEngine);
// Starting the car
myCar.start(); // Outputs: 2022 BMW X5 is starting...
// Printing car and engine details
myCar.printCarDetails();
/*
Outputs:
Car Details: 2022 BMW X5
Engine Details: 300 HP, Petrol engine
*/
