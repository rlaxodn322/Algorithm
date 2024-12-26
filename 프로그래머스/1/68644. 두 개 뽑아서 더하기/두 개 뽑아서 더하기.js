function solution(numbers) {
    let sum = 0;
    let arr = [];
    for(let i=0;i<numbers.length; i++){
        for(let j=i+1; j<numbers.length; j++){
            arr.push(numbers[i]+ numbers[j]);
        }
    }
    let b = [...new Set(arr.sort((a,b)=> a-b))];
    return b;
}