
const prompt = require('prompt-sync')();


const random = Math.floor(Math.random() * 10) + 1;


const usr = parseInt(prompt("Guess a number between 1 and 10: "), 10);


if (random === usr) {
  console.log("Good work");
} else {
  console.log(`Not matched, the number was ${random}`);
}
