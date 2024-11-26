const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
let stack = [];
let result = [];
let count = input.shift();

for(let i=0; i<count; i++){
   switch(input[i]) {
   case 'pop':
   result.push(stack.pop() || -1 );
   break;
   case 'size':
   result.push(stack.length);
   break;
   case 'empty':
   result.push(stack[0] ? 0: 1);
   break;
   case 'top':
   result.push(stack[stack.length-1] || -1 );
   break;
   default:
   stack.push(input[i].split(' ')[1]);
   break;
}
 
}
console.log(result.join('\n'));
