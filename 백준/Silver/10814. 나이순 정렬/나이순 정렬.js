const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
const count = Number(input[0]);
const num = input.slice(1).map((line, index) => {
    const [age, name]= line.split(' ');
    return {age: Number(age), name, index};
})

num.sort((a,b) => {
  if(a.age===b.age){return  a.index - b.index};
  return a.age- b.age;
})

num.forEach(a => console.log(a.age+' ' + a.name));