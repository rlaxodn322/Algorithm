const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);
let N = input[0];
let m = input[1];
let M = input[2];
let T = input[3];
let R = input[4];

let A = m;
let B = 0;
let C = 0;

if(m+T > M){
 console.log(-1);
}else{
  while(B<N){
    if(A+T<=M){
       A+= T;
       B++
}else{
   A = Math.max(m, A-R);
}
C++;
}
console.log(C);
}