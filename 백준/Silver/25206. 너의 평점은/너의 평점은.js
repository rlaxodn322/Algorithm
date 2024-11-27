const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
const gradleObject = {'A+': 4.5, 'A0': 4.0, 'B+': 3.5, 'B0': 3.0, 'C+': 2.5, 'C0': 2.0, 'D+': 1.5, 'D0': 1.0, 'F': 0.0 };

let totalGradle = 0;
let totalPoint = 0;

for(let i=0; i<input.length; i++){
   let [a, b, c] = input[i].split(' ');
   b = parseFloat(b);
   if(c!=='P'){
     totalGradle+= b;
     totalPoint += b * gradleObject[c];
   }
}

let sum = totalPoint / totalGradle;
console.log(sum.toFixed(4));