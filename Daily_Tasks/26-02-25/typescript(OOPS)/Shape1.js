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
var Shape1 = /** @class */ (function () {
    function Shape1(color) {
        this.color = color;
    }
    Shape1.prototype.draw = function () {
        console.log("Drawing a shape of color: ".concat(this.color));
    };
    return Shape1;
}());
// Derived class Circle extending Shape
var Circle1 = /** @class */ (function (_super) {
    __extends(Circle1, _super);
    function Circle1(color, radius) {
        var _this = _super.call(this, color) || this;
        _this.radius = radius;
        return _this;
    }
    // Override the draw method for Circle
    Circle1.prototype.draw = function () {
        console.log("Drawing a circle of color: ".concat(this.color, " and radius: ").concat(this.radius));
    };
    return Circle1;
}(Shape1));
// Create instances and call the draw method
var shape = new Shape1('blue');
shape.draw(); // Output: Drawing a shape of color: blue
var circle = new Circle1('red', 5);
circle.draw(); // Output: Drawing a circle of color: red and radius: 5
