class Bus1 {
  // Properties of the Bus class
  make: string;
  model: string;
  year: number;

  // Constructor to initialize the properties
  constructor(make: string, model: string, year: number) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  // Method to indicate that the Bus is starting
  start(): void {
    console.log(`${this.year} ${this.make} ${this.model} is starting...`);
  }
}

// Creating a Bus object
const BusIn = new Bus1('Mercedes', 'Sprinter', 2022);

// Calling the start method to indicate the Bus is starting
BusIn.start();
