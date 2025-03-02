class Bus {

  make: string;
  model: string;
  year: number;

  constructor(make: string, model: string, year: number) {
    this.make = make;
    this.model = model;
    this.year = year;
  }
  displayDetails(): void {
    console.log(`Bus Details: ${this.year} ${this.make} ${this.model}`);
  }
}

const myBus = new Bus('Volvo', 'X123', 2021);
myBus.displayDetails();
