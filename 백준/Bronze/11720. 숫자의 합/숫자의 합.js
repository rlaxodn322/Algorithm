const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
let A = input[0];
let B = input[1].split('').map(Number);

let result = B.reduce((a,b) => a+b, 0);
console.log(result);