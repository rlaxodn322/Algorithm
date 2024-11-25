const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);
let [X,Y,W,H] = input;

console.log(Math.min(X,W-X,Y,H-Y));