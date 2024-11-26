const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
let count = Number(input.shift());
let result = [];

for (let i = 0; i < count; i++) {
    let words = input[i].split(' ');  // 문장을 단어 단위로 분리
    let reversedWords = words.map(word => word.split('').reverse().join('')); // 각 단어를 뒤집음
    result.push(reversedWords.join(' ')); // 뒤집힌 단어들을 합쳐서 결과에 추가
}

console.log(result.join('\n')); // 결과 출력
