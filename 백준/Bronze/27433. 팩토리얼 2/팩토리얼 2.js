const input = require('fs').readFileSync('/dev/stdin').toString().trim();
const a = parseInt(input, 10);

function ff(a){
  if(a===0){
   return 1;
}
  return a * ff(a-1);
}

console.log(ff(a));