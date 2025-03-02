
class Vehicle {
  make: string;
  model: string;

  constructor(make: string, model: string) {
    this.make = make;
    this.model = model;
  }

  showDetails(): void {
    console.log(`Vehicle Make: ${this.make}, Model: ${this.model}`);
  }
}

// Derived class Car extending Vehicle
class Car2 extends Vehicle {
  doors: number;

  constructor(make: string, model: string, doors: number) {
    super(make, model); 
    this.doors = doors;
  }

  showDetails(): void {
    console.log(`Car Make: ${this.make}, Model: ${this.model}, Doors: ${this.doors}`);
  }
}


class SportsCar extends Car2 {
  topSpeed: number;

  constructor(make: string, model: string, doors: number, topSpeed: number) {
    super(make, model, doors); 
    this.topSpeed = topSpeed;
  }

  showDetails(): void {
    console.log(`Sports Car Make: ${this.make}, Model: ${this.model}, Doors: ${this.doors}, Top Speed: ${this.topSpeed} km/h`);
  }
}


const vehicle = new Vehicle('Toyota', 'Corolla');
vehicle.showDetails(); 

const car = new Car2('Honda', 'Civic', 4);
car.showDetails(); 

const sportsCar = new SportsCar('Ferrari', '488', 2, 330);
sportsCar.showDetails(); 
