function celstofar(num)
{
  return (num*9/5)+32;
}
function fartocel(num1)
{
  return (num1-32)*5/9;
} 
const a=celstofar(50);
console.log(`cel to farenheit ${a}`);
const b=celstofar(90);
console.log(`farenheit to cel${b}`);
