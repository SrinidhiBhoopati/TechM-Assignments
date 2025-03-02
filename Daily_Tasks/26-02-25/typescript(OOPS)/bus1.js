var Bus1 = /** @class */ (function () {
    // Constructor to initialize the properties
    function Bus1(make, model, year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    // Method to indicate that the Bus is starting
    Bus1.prototype.start = function () {
        console.log("".concat(this.year, " ").concat(this.make, " ").concat(this.model, " is starting..."));
    };
    return Bus1;
}());
// Creating a Bus object
var BusIn = new Bus1('Mercedes', 'Sprinter', 2022);
// Calling the start method to indicate the Bus is starting
BusIn.start();
