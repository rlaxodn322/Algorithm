const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
const a = Number(input[0]);
const n = new Set(input[1].split(' ').map(Number));
const b = Number(input[2]);
const m = input[3].split(' ').map(Number);

let result = m.map(a => n.has(a) ? 1 : 0);
console.log(result.join(' '));