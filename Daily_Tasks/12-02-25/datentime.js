//Write a JavaScript program to display the current day and time in the following format.  
//Sample Output : Today is : Tuesday.
//Current time is : 10 PM : 30 : 38

const n=new Date();
const days=["sunday","monday","tuesday","wednesday","thrusday","friday","saturday"];
const day=days[n.getDay()];
let hrs=n.getHours();
const mins=n.getMinutes();
const secs=n.getSeconds();
const amorpm = hrs>=12?'PM':'AM';
hrs=hrs%12||12;
console.log(`today is:${day}`);
console.log(`Current time is: ${hrs} ${amorpm} ${mins} ${secs}`);

