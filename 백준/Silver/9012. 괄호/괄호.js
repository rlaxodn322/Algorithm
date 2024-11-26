const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
let count = Number(input.shift());
let result = [];

for(let i=0; i<count; i++){
  let stack = [];
  let bool = true;
  let a = input[i];

  for(let char of a){
     if(char ==='('){
       stack.push(char);
     }else if(char ===')' ){
         if(stack.length ===0) {
           bool = false;
           break;
         }else{
         stack.pop();

    }

}

}
  if(stack.length !== 0) {
     bool = false;
}
   result.push(bool ? 'YES' : 'NO') ;
}
console.log(result.join('\n'));