function sortNumbers(num1, num2, num3) {
  let largest = Math.max(num1, num2, num3);
  let smallest = Math.min(num1, num2, num3);
  let middle = num1 + num2 + num3 - largest - smallest;

  console.log(`Sorted numbers: ${largest}, ${middle}, ${smallest}`);
}


sortNumbers(0, -1, 4); 1
