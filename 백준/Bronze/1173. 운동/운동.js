const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);
let N =input[0];
let m = input[1];
let M =input[2];
let T = input[3];
let R =input[4];
let a = 0;
let max = m;
let count = 0;

if(m+T > M ){
  console.log(-1);
}else{
     while(a<N){         
       if(max+T <=M){
       max += T;
       a++; 
} else{
   max = Math.max(m, max - R );
}
count ++;
}
console.log(count);
}