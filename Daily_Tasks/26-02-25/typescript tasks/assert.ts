
let myString: string = "123";
let assertedNumber: number = myString as unknown as number; 

console.log(`Using type assertion (incorrect way): ${assertedNumber + 1}`);
let convertedNumber: number = parseInt(myString);

console.log(`Using parseInt() for proper type conversion: ${convertedNumber + 1}`);