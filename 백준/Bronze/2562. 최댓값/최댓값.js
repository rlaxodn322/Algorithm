const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

let X =0;
let count = 0;
for(let i=0; i<9; i++){
   let a = Number(input[i]);
   if(a>X){
   X = a;
  count = i + 1;
}   

}

console.log(X);
console.log(count);