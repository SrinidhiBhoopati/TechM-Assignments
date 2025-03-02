// Base class Shape
class Shape {
  color: string;

  constructor(color: string) {
    this.color = color;
  }

  // Method to display shape details
  displayDetails(): void {
    console.log(`Color of shape: ${this.color}`);
  }
}

// Derived class Circle extending Shape
class Circle extends Shape {
  radius: number;

  constructor(color: string, radius: number) {
    super(color); // Call the parent class constructor to initialize color
    this.radius = radius;
  }

  // Method to display circle details
  displayDetails(): void {
    super.displayDetails(); // Call the parent class method to display color
    console.log(`Radius of circle: ${this.radius}`);
  }
}

// Example usage
const myCircle = new Circle('blue', 10);
myCircle.displayDetails();
