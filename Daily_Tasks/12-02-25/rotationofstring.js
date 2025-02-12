//Write a JavaScript program to rotate the string 'digiterati' in the right direction.
// This is done by periodically removing one letter from the string end and attaching it to the front.  

function rotate(str)
{
  let rstr=str;
  setInterval(()=>{
  
  rstr=rstr[rstr.length-1]+rstr.slice(0,-1);
  console.log(rstr)},1000);
}

rotate(`digiterati`);