function solution(n) {
    let count = (num)=> num.toString(2).split('1').length ;
    let top = count(n); 
    let result = n + 1; 
    while(count(result)!== top){
        result++;
    }
    return result;
}