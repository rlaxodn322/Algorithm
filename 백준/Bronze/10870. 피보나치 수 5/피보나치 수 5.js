const input = require('fs').readFileSync('/dev/stdin').toString().trim();
const a = parseInt(input, 10);

function ff(a){
  if(a===0){
  return 0;
} else if(a===1){
 return 1;
}else{
 return ff(a-1) + ff(a-2);
}
}

console.log(ff(a));