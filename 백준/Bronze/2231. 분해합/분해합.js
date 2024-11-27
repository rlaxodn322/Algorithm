const input = require('fs').readFileSync('/dev/stdin').toString().trim();
const N = Number(input);

function force(N){
 for(let i=0; i<N; i++){
  let num = i;
  let sum = i;
  while(num>0){
   sum += num %10;
   num = Math.floor(num / 10);
 }
   if(sum === N) {
      return i;
}
  }

return 0;
}

console.log(force(N));