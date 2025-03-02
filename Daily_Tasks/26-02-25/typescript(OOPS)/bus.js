var Bus = /** @class */ (function () {
    function Bus(make, model, year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    Bus.prototype.displayDetails = function () {
        console.log("Bus Details: ".concat(this.year, " ").concat(this.make, " ").concat(this.model));
    };
    return Bus;
}());
var myBus = new Bus('Volvo', 'X123', 2021);
myBus.displayDetails();
