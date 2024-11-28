const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('');
const num = input.map(Number);
num.sort((a,b)=> b-a);
console.log(num.join(''));