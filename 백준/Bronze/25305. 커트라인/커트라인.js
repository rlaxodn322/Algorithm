const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
const a  =input[0].split(' ').map(Number);
const b = input[1].split(' ').map(Number);

const N = a[0];
const k = a[1];

let bsort = b.sort((a,b) => b-a);
console.log(bsort[k-1]);
