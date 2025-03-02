var x = 10;
if (true) {
    var x = 20;
    console.log("Inside block (var x):", x);
}
console.log("Outside block (var x):", x);
var y = 10;
if (true) {
    var y_1 = 20;
    console.log("Inside block (let y):", y_1);
}
console.log("Outside block (let y):", y);
var z = 30;
console.log("Constant (const z):", z);
