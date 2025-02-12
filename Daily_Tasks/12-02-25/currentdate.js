//Write a JavaScript program to get the current date.  
//Expected Output :
//mm-dd-yyyy, mm/dd/yyyy or dd-mm-yyyy, dd/mm/yyyy

const date=new Date();
const day=date.getDay();
const month=date.getMonth()+1;
const year=date.getFullYear();

const fday=(day<10?'0':'')+day;
const fmnth=(month<10?'0':'')+month;
console.log(`${fmnth}-${fday}-${year}`);
console.log(`${fmnth}/${fday}/${year}`);


