function findLargestNumber(num1, num2) {
  if (num1 > num2) {
      console.log(`The largest number is: ${num1}`);
  } else if (num2 > num1) {
      console.log(`The largest number is: ${num2}`);
  } else {
      console.log("Both numbers are equal.");
  }
}
const num1 = 8;
const num2 = 12;
findLargestNumber(num1, num2);
