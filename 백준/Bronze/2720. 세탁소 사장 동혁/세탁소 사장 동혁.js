const fs = require('fs');
const input = fs.readFileSync('dev/stdin').toString().trim().split('\n');

const testcase = Number(input[0])
let A = 25;
let B = 10;
let C = 5;
let D = 1;

for(let i=1; i<=testcase; i++){
   let x = Number(input[i]);
   let a = Math.floor(x/A);
   x %= A;
   let b = Math.floor(x/B);
   x %= B;
   let c = Math.floor(x/C);
   x %= C;
   let d = Math.floor(x/D);

  console.log(a+' '+b+' '+c+' '+d);
}
