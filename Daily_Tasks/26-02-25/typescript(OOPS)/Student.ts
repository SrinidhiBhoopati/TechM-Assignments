
class Student {
  name: string;
  studentClass: string;

  constructor(name: string, studentClass: string) {
    this.name = name;
    this.studentClass = studentClass;
  }

  displayDetails(): void {
    console.log(`Student Name: ${this.name}, Class: ${this.studentClass}`);
  }
}


const student1 = new Student('John Doe', '10th Grade');


student1.displayDetails();  
