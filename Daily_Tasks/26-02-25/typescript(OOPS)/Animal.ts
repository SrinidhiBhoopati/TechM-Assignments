
class Animal {
  name: string;
  species: string;

  constructor(name: string, species: string) {
    this.name = name;
    this.species = species;
  }

  displayDetails(): void {
    console.log(`Animal Name: ${this.name}`);
    console.log(`Species: ${this.species}`);
  }
}

class Tiger extends Animal {
  
  constructor(name: string) {
    super(name, 'Tiger'); 
  }


  roar(): void {
    console.log(`${this.name} the Tiger is roaring!`);
  }
}

const tiger1 = new Tiger('Sheru');
tiger1.displayDetails();
tiger1.roar();
