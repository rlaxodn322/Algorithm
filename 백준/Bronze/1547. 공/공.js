const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
let A = Number(input[0]);
let ball = 1;
for(let i=1; i<=A; i++){
    let [a, b] = input[i].split(' ').map(Number);
    if(ball === a){
        ball = b;
    }else if(ball === b){
        ball = a;
    }
}
console.log(ball);