
type Person = {
  name: string;
  age: number;
  occupation?: string; 
};
type Status = 'active' | 'inactive' | 'pending';
const person1: Person = {
  name: 'John Doe',
  age: 30,
  occupation: 'Engineer'
};

const userStatus: Status = 'active';

console.log(person1);
console.log(userStatus);
