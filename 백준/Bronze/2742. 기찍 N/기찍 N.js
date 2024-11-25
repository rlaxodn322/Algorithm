const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

let A =input[0];
for(let i=A; i>0; i--){
  console.log(i);
}
