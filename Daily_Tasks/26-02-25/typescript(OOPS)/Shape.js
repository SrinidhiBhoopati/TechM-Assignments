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
// Base class Shape
var Shape = /** @class */ (function () {
    function Shape(color) {
        this.color = color;
    }
    // Method to display shape details
    Shape.prototype.displayDetails = function () {
        console.log("Color of shape: ".concat(this.color));
    };
    return Shape;
}());
// Derived class Circle extending Shape
var Circle = /** @class */ (function (_super) {
    __extends(Circle, _super);
    function Circle(color, radius) {
        var _this = _super.call(this, color) || this; // Call the parent class constructor to initialize color
        _this.radius = radius;
        return _this;
    }
    // Method to display circle details
    Circle.prototype.displayDetails = function () {
        _super.prototype.displayDetails.call(this); // Call the parent class method to display color
        console.log("Radius of circle: ".concat(this.radius));
    };
    return Circle;
}(Shape));
// Example usage
var myCircle = new Circle('blue', 10);
myCircle.displayDetails();
