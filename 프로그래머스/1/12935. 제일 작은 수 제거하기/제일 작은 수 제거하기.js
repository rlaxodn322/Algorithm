function solution(arr) {
    if(arr.length===1){
        return [-1];
    }
    let a = Math.min(...arr);
    
    let c = arr.filter(b => b != a);
    return c;
}