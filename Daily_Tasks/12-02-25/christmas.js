const tdy=new Date();
const chrms= new Date(tdy.getFullYear(),11,25);
if(tdy>chrms)
  chrms.setFullYear(chrms.getFullYear()+1);
const diff=chrms-tdy;
const diffdays=Math.ceil(diff/(1000*60*60*24));
console.log(`days for christmas ${diffdays}`);