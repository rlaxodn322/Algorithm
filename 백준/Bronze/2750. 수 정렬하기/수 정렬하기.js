const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
const count = Number(input[0])
const num = input.slice(1).map(Number);

num.sort((a,b) => a-b);

num.forEach(num1 => console.log(num1));