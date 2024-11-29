const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
const count = Number(input[0]);
const num = input.slice(1).map(line => {
   const [x,y] = line.split(' ').map(Number);
   return {x, y};
});

num.sort((a,b) => {
   if(a.y === b.y){return a.x - b.x};
   return a.y- b.y;
})

num.forEach(a => { console.log(a.x + ' ' + a.y) });