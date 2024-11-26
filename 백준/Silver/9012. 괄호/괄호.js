const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
const output = processTestcase(input);
console.log(output);
function isValid(a){
   let stack = [];
   for(let char of a){
     if(char === '('){
       stack.push(char);
} else if(char ===')' ) {
    if(stack.length ===0) {
      return false;
}else{
  stack.pop();
}
}
}
return stack.length === 0;
}
function processTestcase(input){
let count = Number(input.shift());
let result = [];
for(let i=0; i<count; i++){
  
  let a = input[i];
  let bool = isValid(a);  
  result.push(bool ? 'YES' : 'NO') ; 
}
return result.join('\n');
}