// Engine class with properties horsepower and fuelType
class Engine {
  horsepower: number;
  fuelType: string;

  constructor(horsepower: number, fuelType: string) {
    this.horsepower = horsepower;
    this.fuelType = fuelType;
  }
}

// Base class: Car
class Car1 {
  make: string;
  model: string;
  year: number;
  engine: Engine; // Car has an instance of the Engine class

  constructor(make: string, model: string, year: number, engine: Engine) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.engine = engine; // Initialize engine property
  }

  // Method to start the car
  start(): void {
    console.log(`${this.year} ${this.make} ${this.model} is starting...`);
  }

  // Method to print car and engine details
  printCarDetails(): void {
    console.log(`Car Details: ${this.year} ${this.make} ${this.model}`);
    console.log(`Engine Details: ${this.engine.horsepower} HP, ${this.engine.fuelType} engine`);
  }
}

// Creating an instance of the Engine class
const myEngine = new Engine(300, 'Petrol');

// Creating a Car object with an Engine instance
const myCar = new Car1('BMW', 'X5', 2022, myEngine);

// Starting the car
myCar.start(); // Outputs: 2022 BMW X5 is starting...

// Printing car and engine details
myCar.printCarDetails();
/* 
Outputs: 
Car Details: 2022 BMW X5
Engine Details: 300 HP, Petrol engine
*/
