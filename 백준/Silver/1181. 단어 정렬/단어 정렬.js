const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
const count = Number(input[0]);
const num = input.slice(1);
const numUpdate = Array.from(new Set(num));

numUpdate.sort((a,b) => {
    if(a.length === b.length){return a.localeCompare(b)};
    return a.length - b.length;
})

numUpdate.forEach(aa => console.log(aa));