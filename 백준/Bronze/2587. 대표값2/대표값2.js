const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
const num = input.map(Number);

let reducenum = num.reduce((a,b) => a+b, 0);

let sortnum = num.sort((a,b) => a-b);

console.log(Math.round(reducenum/num.length));
console.log(sortnum[2]);