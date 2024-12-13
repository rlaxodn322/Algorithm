const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
const [a, b] = input[0].split(' ').map(Number);
const coinValues = input.slice(1, a+1).map(Number);
let maxCoin = b;
let count = 0;
for(let i=a-1; i>=0; i--){
   const coin = coinValues[i];
   if(coin <= maxCoin){
    let result = Math.floor(maxCoin / coin);
    count += result;
    maxCoin -= coin * result
}

}

console.log(count);
