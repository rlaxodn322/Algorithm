function solution(arr, divisor) {
    let array = arr.filter(a => a%divisor===0);
    if(array.length===0){
        return [-1];
    }
    return array.sort((a,b) => a-b);
}