
var x = 10;
if (true) {
    var x = 20; 
    console.log("Inside block (var x):", x); 
}
console.log("Outside block (var x):", x); 


let y = 10;
if (true) {
    let y = 20; 
    console.log("Inside block (let y):", y); 
}
console.log("Outside block (let y):", y);


const z = 30;
console.log("Constant (const z):", z); 

