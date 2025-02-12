//Write a JavaScript program to find out if 1st January will be a Sunday between 2014 and 2050.  

for(let yr=2014;yr<=2050;yr++)
{
  const date=new Date(yr,0,1);
  if(date.getDay()===0)
    console.log(`1st jan is sunday in year:${yr}`);
}