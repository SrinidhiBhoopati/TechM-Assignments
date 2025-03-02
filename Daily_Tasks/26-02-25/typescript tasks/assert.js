var myString = "123";
var assertedNumber = myString;
console.log("Using type assertion (incorrect way): ".concat(assertedNumber + 1));
var convertedNumber = parseInt(myString);
console.log("Using parseInt() for proper type conversion: ".concat(convertedNumber + 1));
