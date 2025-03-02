class Stud {
  name: string;
  age: number;

  constructor(name: string, age: number) {
    this.name = name;
   
    if (age > 0) {
      this.age = age;
    } else {
      this.age = 0;
      console.log(`Invalid age provided. Setting age to default value: 0`);
    }
  }

  displayDetails(): void {
    console.log(`Student Name: ${this.name}`);
    console.log(`Student Age: ${this.age}`);
  }
}


const stud1 = new Stud('Alice', 20);
student1.displayDetails();

const stud2 = new Stud('Bob', -5); 
student2.displayDetails();
