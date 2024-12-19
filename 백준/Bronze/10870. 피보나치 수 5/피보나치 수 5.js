const input = require('fs').readFileSync('/dev/stdin').toString().trim();
const a = parseInt(input, 10);

function ff(a){
  let aa = 0, bb=1, cc;
  if(a===0)return 0;
  if(a===1)return 1;

  for(let i=2; i<=a; i++){
    cc = aa+ bb;
    aa = bb;
    bb = cc;

}
return bb;

}
console.log(ff(a));