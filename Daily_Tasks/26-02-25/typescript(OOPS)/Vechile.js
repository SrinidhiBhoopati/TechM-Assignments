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
var Vehicle = /** @class */ (function () {
    function Vehicle(make, model) {
        this.make = make;
        this.model = model;
    }
    Vehicle.prototype.showDetails = function () {
        console.log("Vehicle Make: ".concat(this.make, ", Model: ").concat(this.model));
    };
    return Vehicle;
}());
// Derived class Car extending Vehicle
var Car2 = /** @class */ (function (_super) {
    __extends(Car2, _super);
    function Car2(make, model, doors) {
        var _this = _super.call(this, make, model) || this;
        _this.doors = doors;
        return _this;
    }
    Car2.prototype.showDetails = function () {
        console.log("Car Make: ".concat(this.make, ", Model: ").concat(this.model, ", Doors: ").concat(this.doors));
    };
    return Car2;
}(Vehicle));
var SportsCar = /** @class */ (function (_super) {
    __extends(SportsCar, _super);
    function SportsCar(make, model, doors, topSpeed) {
        var _this = _super.call(this, make, model, doors) || this;
        _this.topSpeed = topSpeed;
        return _this;
    }
    SportsCar.prototype.showDetails = function () {
        console.log("Sports Car Make: ".concat(this.make, ", Model: ").concat(this.model, ", Doors: ").concat(this.doors, ", Top Speed: ").concat(this.topSpeed, " km/h"));
    };
    return SportsCar;
}(Car2));
var vehicle = new Vehicle('Toyota', 'Corolla');
vehicle.showDetails();
var car = new Car2('Honda', 'Civic', 4);
car.showDetails();
var sportsCar = new SportsCar('Ferrari', '488', 2, 330);
sportsCar.showDetails();
