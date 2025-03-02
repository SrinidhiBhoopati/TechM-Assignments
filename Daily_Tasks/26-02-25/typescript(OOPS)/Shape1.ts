// Base class Shape
class Shape1 {
  color: string;

  constructor(color: string) {
    this.color = color;
  }

  draw(): void {
    console.log(`Drawing a shape of color: ${this.color}`);
  }
}

// Derived class Circle extending Shape
class Circle1 extends Shape1 {
  radius: number;

  constructor(color: string, radius: number) {
    super(color); 
    this.radius = radius; 
  }

  // Override the draw method for Circle
  draw(): void {
    console.log(`Drawing a circle of color: ${this.color} and radius: ${this.radius}`);
  }
}

// Create instances and call the draw method
const shape = new Shape1('blue');
shape.draw(); // Output: Drawing a shape of color: blue

const circle = new Circle1('red', 5);
circle.draw(); // Output: Drawing a circle of color: red and radius: 5
